public class Main {
    public static void main(String[] args) {
        //Exercise 1
        checkYear(2500);
        //Exercise 2
        checkPhoneOsAndYear(0,2015);
        //Exercise 3
        checkDistance(59);
    }
    public static void checkYear(int year){
        boolean isLeapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
        if (isLeapYear)
        {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосным год");
        }
    }
    public static void checkPhoneOsAndYear(int clientOS2, int clientDeviceYear){
        if (clientOS2 == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if (clientOS2 == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if(clientOS2 == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else if(clientOS2 == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void checkDistance(int deliveryDistance){
        if(deliveryDistance <20){
            System.out.println("Потребуется 1 день");
        }else if(deliveryDistance >=20 && deliveryDistance <60){
            System.out.println("Потребуется 2 дня");
        }else if(deliveryDistance >=60 && deliveryDistance <100){
            System.out.println("Потребуется 3 дня");
        }
    }
}