package KaNNaT.first;

public class Main {

    public static void main(String[] args) {
        // Task # 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        // Task # 2
        int clientDeviceYear = 2013;
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        // Task # 3
        int yaer = 2020;
        if (yaer % 4 == 0 && yaer % 100 != 0 || yaer % 400 == 0) {
            System.out.println(yaer + " год является високосным");
        } else {
            System.out.println(yaer + " год не является високосным");
        }

        // Task # 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставка не осуществляется, приносим Вам свои извиния");
        }

        // Task # 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь. Зима");
                break;
            case 2:
                System.out.println("Февраль. Зима");
                break;
            case 3:
                System.out.println("Март. Весна");
                break;
            case 4:
                System.out.println("Апрель. Весна");
                break;
            case 5:
                System.out.println("Май. Весна");
                break;
            case 6:
                System.out.println("Июнь. Лето");
                break;
            case 7:
                System.out.println("Июль. Лето");
                break;
            case 8:
                System.out.println("Август. Лето");
                break;
            case 9:
                System.out.println("Сентябрь. Осень");
                break;
            case 10:
                System.out.println("Октябрь. Осень");
                break;
            case 11:
                System.out.println("Ноябрь. Осень");
                break;
            case 12:
                System.out.println("Декабрь. Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }



    }
}
