package task4;

import task2.AirTicket;
import task2.TheaterTicket;
import task2.Ticket;
import task2.TrainTicket;

/*
 * Общий результат - суммарная стоимость всех билетов:
 * сумма calculateFinalPrice() по всем билетам массива.
 */
public class Main {
    public static double total(Ticket[] tickets) {
        double sum = 0;
        for (Ticket t : tickets) {
            sum = sum + t.calculateFinalPrice();
        }
        return sum;
    }

    public static void main(String[] args) {
        Ticket[] tickets = {
                new TrainTicket(1, "Иван", 2000, "01.11.2026", 5, true),
                new TrainTicket(2, "Анна", 1800, "02.11.2026", 3, false),
                new AirTicket(3, "Мария", 6000, "05.11.2026", "SU-123", 10),
                new AirTicket(4, "Пётр", 5500, "06.11.2026", "S7-456", 0),
                new TheaterTicket(5, "Олег", 1200, "10.11.2026", "Гамлет", 3),
                new TheaterTicket(6, "Ольга", 1200, "10.11.2026", "Гамлет", 12)
        };

        for (Ticket t : tickets) {
            System.out.println(t);
            System.out.println("  " + t.getDescription() + " - итого " + t.calculateFinalPrice());
        }

        System.out.println("Общая стоимость: " + total(tickets));
    }
}
