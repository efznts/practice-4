package task3;

/*
 * Предметная область: кинетическая энергия движущихся тел
 * (продолжение программы из практических 1-3).
 * Body - любое тело, E = m * v * v / 2
 * Car  - машина, к массе добавляется 70 кг на каждого пассажира
 * Ball - катящийся шар, E = 0.7 * m * v * v (учтено вращение)
 *
 * Инкапсуляция - поля private, доступ к ним только через методы,
 *                а конструктор проверяет, что данные правильные.
 * Наследование - Car и Ball наследуют от Body имя, массу и скорость.
 * Переопределение - Car и Ball по-своему переписывают метод energy().
 * Полиморфизм - в массиве типа Body лежат разные объекты, и для каждого
 *                вызывается его собственная версия energy().
 */
public class Main {
    public static void main(String[] args) {
        Body body = new Car("Лада", 1000, 20, 2);   // переменная родительского типа
        System.out.println(body);

        Body[] bodies = {
                new Body("Камень", 2, 10),
                new Car("Лада", 1000, 20, 2),
                new Ball("Мяч", 0.5, 4, 0.1)
        };

        for (Body b : bodies) {
            System.out.println(b + " -> E = " + b.energy() + " Дж");
        }

        Body copy = new Car("Лада", 1000, 20, 2);
        System.out.println("equals: " + body.equals(copy));
        System.out.println("hashCode: " + body.hashCode() + " и " + copy.hashCode());
        System.out.println("equals с камнем: " + body.equals(bodies[0]));

        try {
            new Body("Ошибка", -5, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
