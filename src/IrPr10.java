public class IrPr10 {

    public static void printLineTask(int number) {
        System.out.println("\n________________________________ex" + number + "_______________________________");

    }
    //3
    public static void printPower(int number, int times) {
        for (int i = 0; i <= times; i++) {
            System.out.print((int) Math.pow(number, i) + " ");
        }
    }
    //4
    public static void printPowerWithComa(int number, int times) {
        for (int i = 0; i <= times; i++) {
            System.out.print((int) Math.pow(number, i) + ", ");
        }
    }

    //8
    public static void getProgression(int a, int b) {
        for (int i = 0; i < 10; i++) {
            int number = a * (int) Math.pow(b, i);
            if (number >= 1000) {
                break;
            }
            System.out.print(number + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("************** HOME WORK PART II *******************");
        printLineTask(1);

        /*
        Распечатать последовательность чисел от -100 до 100 включительно,
        в которой каждое следующее число больше предыдущего на 3
         */

        for (int i = -100; i <= 100; i += 3) {
            if (i % 20 == 0) {
                System.out.print("\n" + i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        printLineTask(2);
        /*
         * Распечатать последовательность чисел: 1, -1, 2, -2, 3, -3, ... 10, -10
         */

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ", " + -i + ", ");

        }
        System.out.println();

        printLineTask(3);
        /*
         * Распечатать последовательность чисел: 1 5 25 125 625 3125 15625 78125 390625
         */
        for (int n = 0; n <= 8; n++) {
            System.out.print((int) Math.pow(5, n) + " ");
        }
        System.out.println();
        // то же, но с помощью метода
        printPower(5, 8);

        System.out.println();

        printLineTask(4);
    /*
    Распечатать последовательность чисел: 1, 10, 100, 1000, 10000, 100000, 1000000
     */
        printPowerWithComa(10, 6);

        printLineTask(5);
        /*
         * Распечатать с помощью for
         * 1
         * 10
         * 100
         * 1000
         * 10000
         * 100000
         * 1000000
         */
        for (int n = 0; n <= 6; n++) {
            System.out.println((int) Math.pow(10, n));
        }

        printLineTask(6);
        /*
        Распечатать с помощью for:
        1000000
        100000
        10000
        1000
        100
        10
        1
         */

        for (int n = 6; n >= 0; n--) {
            System.out.println((int) Math.pow(10, n));
        }

        printLineTask(7);
        /*
        Распечатать с помощью for:
        1
        101
        10101
        1010101
        101010101
         */
        String row = "1";
        for (int n = 0; n <= 4; n++) {
            System.out.println(row);
            row += "01";
        }

        System.out.println("2 способ");
        for (int n = 1; n <= 101010101; n = n * 100 + 1) {
            System.out.println(n);
        }

        printLineTask(8);
        /*
         * Написать метод, который принимает на вход 2 целочисленных параметра (a, b) и печатает последовательность
         * положительных  чисел в пределах 1000. Последовательность начинается с числа a,
         * и каждый следующий member последовательности в b раз больше предыдущего.
         * Пример:
         * 3, 7   ->   3 21 147
         * 5, 3   ->   5 15 45 135 405
         */
        getProgression(3, 7);
        System.out.println();
        getProgression(5, 3);

    }




}
