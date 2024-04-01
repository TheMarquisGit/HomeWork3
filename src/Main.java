public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Возраст человека равен " + age + ", он совершеннолетний");
        } else {
            System.out.println("Возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать");
        }

        //Задача 2
        System.out.println("\nЗадача 2");
        int temp = 17;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }

        //Задача 3
        System.out.println("\nЗадача 3");
        int speed = 17;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", придётся заплатить штраф");
        } else System.out.println("Если скорость " + speed + ", можно ездить спокойно");

        //Задача 4
        System.out.println("\nЗадача 4");
        int humanAge = 17;
        if (humanAge >= 2 && humanAge <= 6) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в детский сад");
        } else if (humanAge >= 7 && humanAge <= 17) {
            System.out.println("Если возраст человека равен " + humanAge + ", то ему нужно ходить в школу");
        } else if (humanAge >= 18 && humanAge <= 24) {
            System.out.println("Если возраст человека равен " + humanAge + ", то его место в университете");
        } else if (humanAge > 24) System.out.println("Ну а раз человеку " + humanAge + ", пора идти на работу");

        //Задача 5
        System.out.println("\nЗадача 5");
        int childAge = 17;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься только в сопровождении взрослого");
        } else System.out.println("Ребёнок может кататься без сопровождения взрослого");

        //Задача 6
        System.out.println("\nЗадача 6");
        int vagonPlace = 17;
        if (vagonPlace < 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (vagonPlace > 60 && vagonPlace < 102) {
            System.out.println("В вагоне есть стоячие места");
        } else if (vagonPlace >= 102) {
            System.out.println("Мест нет, вагон полностью забит");
        }

        //Задача 7
        System.out.println("\nЗадача 7");
        int one = 17;
        int two = 0;
        int three = 0;
        int max;
        if (one >= two && one >= three) {
            max = one;
        } else if (two >= one && two >= three) {
            max = two;
        } else max = three;
        System.out.println("Бо́льшее из трёх чисел = " + max);
    }
}