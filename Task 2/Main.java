package task2;

/*
 * Расчёт итоговой цены:
 * поезд   - цена + 150, если взято постельное бельё
 * самолёт - цена + 50 за каждый кг багажа
 * театр   - в рядах 1-5 цена умножается на 1.5
 */
public class Main {
    public static void main(String[] args) {
        Ticket t1 = new TrainTicket(1, "Иван", 2000, "01.11.2026", 5, true);
        Ticket t2 = new AirTicket(2, "Мария", 6000, "05.11.2026", "SU-123", 10);
        Ticket t3 = new TheaterTicket(3, "Олег", 1200, "10.11.2026", "Гамлет", 3);

        // полиморфный вызов: переменные типа Ticket, а методы вызываются у наследников
        Ticket[] tickets = {t1, t2, t3};
        for (Ticket t : tickets) {
            System.out.println(t.getDescription() + " - итого " + t.calculateFinalPrice());
        }

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        Ticket copy = new TrainTicket(1, "Иван", 2000, "01.11.2026", 5, true);
        System.out.println("t1.equals(copy): " + t1.equals(copy));
        System.out.println("t1.equals(t2): " + t1.equals(t2));
        System.out.println("hashCode t1 = " + t1.hashCode() + ", copy = " + copy.hashCode());
    }
}
