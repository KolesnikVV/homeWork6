import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println(" Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2024;
        var leapYear = year % 4;
        if (year % 400 == 0) {
            System.out.println(+year + " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(+year + " год не является високосным");
        } else if (year % 4 == 0) {
            System.out.println(+year + " год является високосным");
        } else {
            System.out.println(+year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 90;
        byte day = 1;
        int day2 = day + 1;
        int day3 = day2 + 1;

        if (deliveryDistance <= 20) {
            System.out.println( "Потребуется дней: " + day);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println( "Потребуется дней: " + day2);
             } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
             System.out.println( "Потребуется дней: " + day3);
                } else {
                 System.out.println("доставки нет");
        }
    }
}

