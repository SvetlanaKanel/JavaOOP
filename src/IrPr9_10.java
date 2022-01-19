import java.util.Arrays;
import java.util.Random;

public class IrPr9_10 {
    //числа от -a до a включительно c шагом 3
    public static void printAToB(int number1, int number2, int step) {

        if (number1 < number2) {
            for (int i = number1; i <= number2; i += step) {
                System.out.print(i + " ");
            }
        }

        if (number1 > number2) {
            for (int i = number1; i >= number2; i -= step) {
                System.out.print(i + " ");
            }
        }
    }

    //2
    public static boolean isEvenNumber(int number) {

        return number % 2 == 0;
    }

    public static void printEvenNumbers(int number1, int number2) {
        if (number1 < number2) {
            for (int i = number1; i <= number2; i++)
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
        }

        if (number1 > number2) {
            for (int i = number2; i <= number1; i++)
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
        }
    }

    // 3
    public static int[] arrayOfOddNumbers(int numberFrom, int numberTo) {
        int length;
        if (numberFrom % 2 == 0 && numberTo % 2 == 0 || numberFrom % 2 != 0 && numberTo % 2 != 0) {
            length = (numberTo - numberFrom) / 2;
        } else {
            length = (numberTo - numberFrom) / 2 + 1;
        }

        int[] array = new int[length];

        if (numberFrom % 2 != 1) {
            numberFrom += 1;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = numberFrom;
            numberFrom += 2;
        }
        return array;
    }

    //8
    public static void printCatsTable(String[] catsName, String[] catsColors, int[] catsAges) {
        for (int i = 0; i < catsName.length; i++) {
            System.out.println(catsName[i] + "\t\t" + catsColors[i] + "\t\t" + catsAges[i]);
        }
    }

    public static void printBoxNumber(String[] catsColors) {
        for (int i = 0; i < catsColors.length; i++) {
            System.out.println("Box number = " + i + "\t" + catsColors[i]);
        }
    }

    public static void giveFood(String[] color) {
        for (int i = 0; i < color.length; i++) {
            if (i == 4 && color[i].equals("Red")) {
                System.out.println("Накорми кота!");
            }
        }
    }

    public static void vetControl(int[] ages) {
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 2) {
                System.out.println(i + " - Отнеси кота на прививку!");
            }
        }
    }

    // 16
    /*
     * Написать метод, который принимает на вход целое положительное число, не больше 10,
     * и возвращает массив double[], который содержит 10 чисел - степени этого числа (Math.pow())
     */
    public static double[] getArrayPowerNumber(int num) {
        double[] arrayDouble = new double[10];
        if (num > 0 && num <= 10) {

            for (int i = 0; i < arrayDouble.length; i++) {
                arrayDouble[i] = Math.pow(num, i);
            }
        }
        return arrayDouble;
    }

    //17
    /*
     *С помощью методов класса Math (догадайтесь по названиям) из массива {-13, 9, -314, -89, 98, 52, -4}:
     * построить новый массив, в котором все числа - положительные
     * построить новый массив, в котором все числа - отрицательные
     */
    public static int[] getArrayPositive(int[] array) {
        int[] arrayPositive = new int [array.length];
        for (int n = 0; n < 7; n++) {
            arrayPositive[n] = Math.abs(array[n]);
        }
        return arrayPositive;
    }

    public static int[] getArrayNegative(int[] array) {
        int[] arrayNegative = new int[array.length];
        for (int n = 0; n < 7; n++) {
            arrayNegative[n] = -Math.abs(array[n]);
        }
        return arrayNegative;
    }
    // 2 способ N17
    public static int[] getArrayNegative_2(int[] array) {
        int[] arrayNegative = new int [array.length];
        for (int n = 0; n < 7; n++) {
            arrayNegative[n] = Math.negateExact(Math.abs(array[n]));
        }
        return arrayNegative;
    }

    public static void printLineTask(int number) {
        System.out.println("\n________________________________ex" + number + "_______________________________");
    }

    public static void main(String[] args) {

        printLineTask(1);

        for (int i = 0; i <= 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("способ 2");

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        //числа от 100 до 1

        for (int i = 100; i >= 1; i--) {
            if (i % 20 == 0) {
                System.out.print("\n" + i + " ");
            } else {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();
        //числа от 100 до 1 с шагом 10

        for (int i = 100; i >= 1; i--) {
            if (i % 10 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n");
        //числа от -a до a включительно c шагом 3

        int a = 20;

        for (int i = -a; i <= a; i += 3) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        //числа от a до b с шагом с
        // вынесли в метод

        printAToB(5, 16, 3);

        System.out.println();

        printLineTask(2);
        //Для чисел  от 1 до 100 распечатать только четные числа
        // см. метод

        for (int i = 1; i <= 100; i++) {
            if (isEvenNumber(i)) {
                System.out.print(i + " ");
            }
        }

        // 2 способ
        System.out.println("\n2 способ");
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + 1 + " ");
        }

        //3 способ
        System.out.println("\n3 способ с полностью выделенным методом");
        printEvenNumbers(1, 100);

        System.out.println();

        printLineTask(3);
        // Для чисел от 101 до 200 создать массив нечетных чисел
        int[] arrayNumbers = new int[(200 - 101) / 2 + 1];
        int number = 101;
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = number;
            number += 2;
        }
        System.out.print(Arrays.toString(arrayNumbers));

        System.out.println("\n2 способ с выделенным методом");
        System.out.println(Arrays.toString(arrayOfOddNumbers(100, 200)));

        printLineTask(4);
        /*
         * Для всех чисел от 1 до 10:
         * если число меньше 5, распечатать значение, умноженное на 10,
         * иначе распечатать значение разделенное на 10
         * Создать массив из получившихся значений
         */
        for (double i = 1; i <= 10; i++) {
            if (i < 5) {
                System.out.println(i * 10);
            } else {
                System.out.println(i / 10);
            }
        }

        double j = 1;
        double[] array1 = new double[10];

        for (int i = 0; i < 10; i++) {
            if (i < 4) {
                array1[i] = j * 10;
                j++;
            } else {
                array1[i] = j / 10;
                j++;
            }
        }
        System.out.println(Arrays.toString(array1));

        printLineTask(5);
        //Создать массив значений (вычислить эти числа в цикле for) 0.01, 0.02, 0.03, 0.04, 0.05, 600, 700, 800, 900
        double[] arrayDouble = new double[9];
        for (int i = 0; i < arrayDouble.length; i++) {
            if (i < 5) {
                arrayDouble[i] = (double) (i + 1) / 100;
            } else {
                arrayDouble[i] = (double) (i + 1) * 100;
            }
        }
        System.out.println(Arrays.toString(arrayDouble));

        printLineTask(6);
        //Создать массив catsColors
        String[] catsNames = new String[8];
        catsNames[0] = "Вася";
        catsNames[1] = "Кузя";
        catsNames[2] = "Снежок";
        catsNames[3] = "Барсик";
        catsNames[4] = "Рыжик";
        catsNames[5] = "Бегемот";
        catsNames[6] = "Матильда";
        catsNames[7] = "Мурка";

        String[] catsColors = new String[8];
        catsColors[0] = "Gray";
        catsColors[1] = "Black";
        catsColors[2] = "Gray";
        catsColors[3] = "Brown";
        catsColors[4] = "Red  ";
        catsColors[5] = "Gray";
        catsColors[6] = "Red";
        catsColors[7] = "Gray";

        printLineTask(7);
        //Создать массив catsAges

        int[] catsAges = new int[8];
        catsAges[0] = 1;
        catsAges[1] = 2;
        catsAges[2] = 1;
        catsAges[3] = 3;
        catsAges[4] = 5;
        catsAges[5] = 3;
        catsAges[6] = 4;
        catsAges[7] = 8;
        // 2 способ
        int[] catsAges2 = {1, 2, 1, 3, 5, 3, 4, 8};

        printLineTask(8);
        /*Написать методЫ (столько сколько нужно), которые принимают на вход массив,
         * и печатают (желательно в виде таблички):
         * номер “коробки” значение, которое лежит в этой “коробке”
         * “Накорми кота!”,  если номер коробки равен 4 и цвет рыжий
         * “Отнеси кота на прививку!”, если возраст кота меньше 2 лет
         *ПРоверить работу метода на массивах catsColors и catsAges
         */
        printCatsTable(catsNames, catsColors, catsAges);
        System.out.println();

        printBoxNumber(catsColors);
        System.out.println();

        giveFood(catsColors);
        System.out.println();

        vetControl(catsAges);
        System.out.println();

        System.out.println("************** HOME WORK PART II *******************");

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

        printLineTask(16);
        /*
         * Написать метод, который принимает на вход целое положительное число, не больше 10,
         * и возвращает массив double[], который содержит 10 чисел - степени этого числа (Math.pow())
         */
        System.out.println(Arrays.toString(getArrayPowerNumber(3)));
        System.out.println(Arrays.toString(getArrayPowerNumber(11)));

        printLineTask(17);
        /*
         *С помощью методов класса Math (догадайтесь по названиям) из массива {-13, 9, -314, -89, 98, 52, -4}:
         * построить новый массив, в котором все числа - положительные
         * построить новый массив, в котором все числа - отрицательные
         */
        int[] array17 = {-13, 9, -314, -89, 98, 52, -4};
        System.out.println("Начальный массив: {-13, 9, -314, -89, 98, 52, -4}");

        System.out.println(Arrays.toString(getArrayPositive(array17)));
        System.out.println(Arrays.toString(getArrayNegative(array17)));
        System.out.println("2 способ");
        System.out.println(Arrays.toString(getArrayNegative_2(array17)));

        printLineTask(18);
        /*
         * С помощью методов класса Math построить массив int[]
         * из 10 случайных положительных трехзначных чисел (random numbers). Числа должны быть не больше 1000.
         * Методы: Math.toIntExact(), Math.round(), Math.random()
         */
        System.out.println("Способ 1 с помощью класса Random и метода nextInt(number)");

        int[] array18 = new int[10];
        Random num_ber = new Random();
        for (int n = 0; n < 10; n++) {
            array18[n] = 100 + num_ber.nextInt(900);
        }
        System.out.println(Arrays.toString(array18));
        System.out.println("\nСпособ 2 с помощью класса Math.random()");

        for (int n = 0; n < 10; n++) {
            array18[n] = (int)(900 * Math.random() + 100);
        }
        System.out.println(Arrays.toString(array18));
        System.out.println("\nСпособ 3 с помощью класса Math и методов toIntExact, round() и random()");

        for (int n = 0; n < 10; n++) {
            array18[n] = Math.toIntExact(Math.round(900 * Math.random() + 100));
        }
        System.out.println(Arrays.toString(array18));

        printLineTask(19);
        /*
         *С помощью методов класса Math построить новый массив double[],
         * в котором содержится квадратный корень каждого значения массива из задания 18.
         */
        double[] array19 = new double[array18.length];
        for (int n = 0; n < 10; n++) {
            array19[n] = Math.sqrt(array18[n]);
        }
        System.out.println(Arrays.toString(array18));
        System.out.println(Arrays.toString(array19));

        printLineTask(20);
        /*
         *С помощью методов класса Math и смекалки создать массив чисел от 1.11 до 1.99 включительно
         * Методы Math.round(), Math.nextUp()
         */
        double[] array20 = new double[89];
        for (int n = 0; n < 89; n ++) {
            //array20[n] = (Math.round(Math.nextUp(111 + n))) / 100.0;
            array20[n] = Math.round(111 + n) / 100.0;
        }
        System.out.println(Arrays.toString(array20));

        System.out.println("2 способ");
        for (int n = 0; n < 89; n++) {
            array20[n] = (111 + n) / 100.0;
        }
        System.out.println(Arrays.toString(array20));
    }
}


