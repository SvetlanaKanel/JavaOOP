import java.util.Arrays;

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
    // 10
    public static void printChar(char a, char b) {
        for (char letter1 = a; letter1 <= b; letter1++) {
            System.out.print(letter1 + " ");
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

        printLineTask(9);
        /*
        Распечатать последовательность: 122333444455555666666777777788888888999999999
         */
        for (int n = 1; n <= 9; n++) {
            int m = n;
            while (m != 0) {
                System.out.print(n);
                m--;
            }
        }

        printLineTask(10);
        /*
        Написать метод, который принимает на вход 2 символа char и печатает все символы char между ними
         */
        printChar('a', 'f');

        printLineTask(11);
        //  Создать массив {0, 45, 90, 135, 180}
        int[] array = {0, 45, 90, 135, 180};
        System.out.println(Arrays.toString(array));

        // 2 способ
        System.out.println("2 способ");
        int[] array2 = new int[5];
        int k = 0;
        for (int n = 0; n < array2.length; n++) {
            array2[n] = k;
            k += 45;
        }
        System.out.println(Arrays.toString(array2));

        printLineTask(12);
        // Создать массив {0.0, 4.5, 9.0, 13.5, 18.0}
        double[] arrayD = {0.0, 4.5, 9.0, 13.5, 18.0};
        System.out.println(Arrays.toString(arrayD));

        // 2 способ
        System.out.println("2 способ");
        double[] arrayD2 = new double[5];
        double d = 0;
        for (int n = 0; n < arrayD2.length; n++) {
            arrayD2[n] = d;
            d += 4.5;
        }
        System.out.println(Arrays.toString(arrayD2));

        printLineTask(13);
        /*
         * Создать массив типа float[] из следующих значений
         * {k, m, l}:
         * double k = 2987.1234
         * int l = 3456
         * float m = 54.3
         */
        double k1 = 2987.1234;
        int l = 3456;
        float m = 54.3F;
        float[] arrayF = {(float) k1, m, l};
        System.out.println(Arrays.toString(arrayF));

        printLineTask(14);
        /*
         * Создать массив типа Byte[] из следующих значений
         * {o, o, o}:
         * Byte o = 32;
         * int  p = 74;
         * Short r = 104;
         */
        Byte o = 32;
        int p = 74;
        Short r = 104;
        Byte[] arrayB = {o, o, o};
        System.out.println(Arrays.toString(arrayB));

        printLineTask(15);
        /*
         * С помощью метода класса Math.pow() создать массив степеней числа 3:
         * [1.0, 3.0, 9.0, 27.0, 81.0, 243.0, 729.0, 2187.0, 6561.0, 19683.0]
         */
        float[] arrayFloat = new float[10];
        for (int n = 0; n < 10; n++) {
            arrayFloat[n] = (float) Math.pow(3, n);
        }
        System.out.println(Arrays.toString(arrayFloat));



    }




}
