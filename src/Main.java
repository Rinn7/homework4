public class Main {
    public static void main(String[] args) {
        int age = 17;
        if (age >= 18) {
            System.out.println("Ты можешь водить");
        } else {
            System.out.println("Ты не можешь водить");
        }
        //task 1
        System.out.println("Задание 1");
        int age1 = 21;
        if (age1 >= 18) {
            System.out.println("Поздравляем с днём рождения!");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил. Нужно немного подождать!");
        }
        //task 2
        System.out.println("Задание 2");
        int age3 = 22;
        if (age3 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        } else if (age3 >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        } else if (age3 >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
        //task 3
        System.out.println("Задание 3");
        int seats = 60;
        int totalPlaces = 102;
        int passengers = 103;
        if (passengers > totalPlaces) {
            System.out.println("Вагон переполнен");
        } else if (passengers > seats) {
            System.out.println("Есть стоячие места");
        } else if (passengers < seats) {
            System.out.println("Есть сидячие места");
        }
        //task 4
        System.out.println("Задание 4");
        int age4 = 5;
        if (age4 > 24) {
            System.out.println("Пора ходить на работу");
        } else if (age4 < 24 && age4 > 18) {
            System.out.println("Пора ходить в университет");
        } else if (age4 < 18 && age4 > 7) {
            System.out.println("Необходмо ходить в школу");
        } else {
            System.out.println("Необходимо ходить в детский сад");
        }
        //task 5
        System.out.println("Задание 5");
        int age5 = 10;
        if (age5 >= 14) {
            System.out.println("Ребёнок может кататься на аттракционе без сопровождения взрослого");
        } else if (age5 >= 5) {
            System.out.println("Ребёнок может кататься на аттракционе только в сопровождении " + " взрослого");
        } else {
            System.out.println("Ребёнок не может кататься на аттракционе");
        }
        //task 6
        System.out.println("Задание 6");
        int one = 10;
        int two = 7;
        int free = 22;
        if (one > two && one > free) {
            System.out.println("Большим числом является " + one);
        } else if (two > one && two > free) {
            System.out.println("Большим числом является " + two);
        } else if (free > one && free > two) {
            System.out.println("Большим числом является " + free);
        }
    }
}