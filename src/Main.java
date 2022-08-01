import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // task №1
        Scanner console = new Scanner(System.in);
        int year = console.nextInt();
        isLeapYear(year);
        // task№2
        installApps(1, 2022);
        // task№3
        int deliveryDistance = 95;
        int deliveryPeriod = calculateDelivery(deliveryDistance);
        if (deliveryPeriod  > 0) {
            System.out.printf("Потребуется дней: %d", deliveryPeriod);
        } else {
            System.out.println("Мы не можем доставить товар");
        }
    }

    public static void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.printf("%d — високосный год\n", year);
        } else {
            System.out.printf("%d — не високосный год\n", year);
        }
    }

    public static void installApps(int typeOS, int year) {
        int currentYear = LocalDate.now().getYear();
        if (typeOS == 0) {
            if (year < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите приложение для iOS по ссылке");
            }
        } else if (typeOS == 1) {
            if (year < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите приложение для Android по ссылке");
            }
        }
    }

    public static int calculateDelivery(int distance) {
        int days = 1;
        if (distance < 20 && distance >= 0) {
            return ++days;
        } else if (distance > 20 && distance < 60) {
            days += 2;
            return days;
        } else if (distance >= 60 && distance < 100) {
            days += 3;
            return days;
        } else {
            return 0;
        }
    }
}