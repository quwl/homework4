public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int ageOne = 19;
        if (ageOne >= 18) {
            System.out.println("Если возраст человека равен " + ageOne + " лет, то он совершеннолетний");
        } else {
            System.out.println("Человек несовершеннолетний");
        }

        System.out.println("Задание 2");
        int temperature = -10;
        if (temperature > 5) {
            System.out.println("На улице тепло, можно идти без шапки");
        }
        if (temperature < 5) {

            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }

        System.out.println("Задание 3");
        int speed = 60;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
        if (speed > 60) {
            System.out.println("Скорость превышена");
        }

        System.out.println("Задание 4");
        int age = 20;
        if (age >= 2 && age <= 6) {
            System.out.println("Человеку нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 17) {
            System.out.println("Человеку нужно ходить в школу");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если человеку " + age + " лет, то ему нужно ходить в университет");
        }
        if (age > 24) {
            System.out.println("Человеку нужно ходить на работу");
        }

        System.out.println("Задание 5");
        int kidAge = 7;
        if (kidAge < 5) {
            System.out.println("Ребёнок не может кататься на аттракционе");
        }
        if (kidAge >= 5 && kidAge < 14) {
            System.out.println("Если ребёнку " + kidAge + " лет, то он может кататься на аттракционе только в сопровождении взрослого");
        }
        if (kidAge >= 14) {
            System.out.println("Ребёнок может кататься на аттракционе без сопровождения взрослого");
        }

        System.out.println("Задание 6");
        int people = 101;
        if (people < 102 && people > 0) {
            System.out.println("В вагоне есть стоячие или сидячие места");
        } else {
            System.out.println("Вагон переполнен");
        }

        System.out.println("Задание 7");
        int one = 1110;
        int two = -9;
        int three = 0;
        if (three > two && three > one) {
            System.out.println("Наибольшее число - " + three);
        } else if (two > three && two > one) {
            System.out.println("Наибольшее число - " + two);
        } else {
            System.out.println("Наибольшее число - " + one);
        }
    }
}

