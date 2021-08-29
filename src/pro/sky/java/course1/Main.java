package pro.sky.java.course1;

public class Main {
    public static void main(String[] args) {

// Задание 1
        int i = 1;
        for (; i < 11; i++) {

            System.out.print(" " + i);
        }
        System.out.println();
        while (i > 1) {
            i = i - 1;
            System.out.print(" " + i);
        }
        System.out.println();
// Задание 2
        int  a = 6;
        for (; a < 31; a = a + 7) {
            System.out.println("Сегодня пятница, " + a + " -ое число. Необходимо подготовить отчет.");
        }
// Задание 3
        int yearNow = 2021;
        int yearKnown = 1975;
        int period = 79;
        int year200minus = yearNow - 200;
        int year100plus = yearNow + 100;
        for (; year200minus < yearKnown; yearKnown = yearKnown - period ) {
        }
        for (; year100plus > yearKnown; yearKnown = yearKnown + period ) {
            if (yearKnown > year200minus) {
                System.out.println(yearKnown);
            }
        }
// Задание 4
        for (int b = 1; b <= 30; b++) {
            if (b % 3 != 0 && b % 5 != 0 ) {
                System.out.println(b + " :");
            }
            if (b % 5 == 0 && b % 3 != 0) {
                System.out.println(b + " :pong");
            }
            if (b % 3 == 0 && b % 5 != 0 ) {
                System.out.println(b + " :ping");
            }
            if (b % 3 == 0 && b % 5 == 0 ) {
                System.out.println(b + " :ping pong");
            }
        }
// Задание 5
        int f1 = 0;
        int f2 = 1;
        System.out.print( f1 + " " + f2);
        for (int i1 = 0; i1 < 35; i1++) {
            if (i1 == f1 + f2) {
                f2 = f1 + f2;
                f1 = f2 - f1;
                System.out.print(" " + i1);
            }
        }

    }
}
