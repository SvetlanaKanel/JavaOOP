public class IrPr3_4 {

    public static void main(String[] args) {
        System.out.println("__________ex 9__________");
        Short s = Short.MAX_VALUE;
        String textMax = "Максимальное значение типа данных ";
        // String sh = "Short = ";
        System.out.println(textMax + s.getClass().getSimpleName() + " = " + s);

        System.out.println("__________ex 10__________");
        Short ss = Short.MIN_VALUE;
        String textMin = "Минимальное значение типа данных ";
        System.out.println(textMin + s.getClass().getSimpleName() + " = " + ss);

        System.out.println("__________ex 11__________");
        byte b = Byte.MIN_VALUE;
        String bt = "byte = ";
        System.out.println(textMin + bt + b);

        System.out.println("__________ex 12__________");
        b = Byte.MAX_VALUE;
        System.out.println(textMax + bt + b);

        System.out.println("__________ex 13__________");
        int i = Integer.MAX_VALUE;
        String itg = "int = ";
        System.out.println(textMax + itg + i);

        System.out.println("__________ex 14__________");
        Integer ii = Integer.MIN_VALUE;
        System.out.println(textMin + ii.getClass().getSimpleName() + " = " + ii);

        System.out.println("__________ex 15__________");
        Integer iI = i;
        System.out.println(textMax + iI.getClass().getSimpleName() + " = " + iI);

        System.out.println("__________ex 16__________");
        i = ii;
        System.out.println(textMin + itg + ii);

        System.out.println("__________ex 17__________");
        Double d = 10.099 + 20.0999;
        System.out.println("Результат суммы Double d = 10.099 + 20.0999 = " + d);
        System.out.println("Результат d.toString() = " + d.toString());
        System.out.println("Результат String.valueOf(d) = " + String.valueOf(d));

        Float f = (float)(10.099 + 20.0999);
        System.out.println("Результат суммы float f = (float)(10.099 + 20.0999) = " + f);

        Float f1 = 10.099F + 20.0999F; // так не верно решает и нельзя к каждой цифре дописывать литеру F
        System.out.println("Результат суммы Float f1 = 10.099F + 20.0999F = " + f1 + " неверный результат") ;

        // Float f2 = d; // это ошибка, т.к Double нельзя заунуть во Float

        String dd = d.toString(); // перевели Double в String
        Float f2 = Float.valueOf(dd); // перевели String во Float и получается через String смогли запихнуть Double во Float
        System.out.println("Результат выражения f2 = Float.valueOf(dd) " + f2 + "d выраженная через стринг и флоат в итоге дала правильный результат");

        System.out.println("__________ex 18__________");
        short ssss = (short) (8000 * 4000);
        System.out.println("Результат прозведения 8000 * 4000 = " + ssss + "результат рандомный т.к. нельзя запихнуть в short  32000000");

        System.out.println("__________ex 19__________");
        Short sss = (short) (800 * d);
        System.out.println("привели double к short, чем округлили результат " + sss);

        System.out.println("__________ex 20__________");
        int number = Integer.MAX_VALUE + 1;
        System.out.println("число Integer.MAX_VALUE + 1 = " + number + " это ошибка");
        // чтобы исправить ошибку нужно взять значение типа long
        long number2 = Integer.MAX_VALUE + 1L;
        System.out.println("теперь число Integer.MAX_VALUE + 1 = " + number + " правльный результат т.к. тип long");

        System.out.println("__________ex 21__________");
        int number1 = Integer.MIN_VALUE - 1;
        System.out.println("число Integer.MIN_VALUE - 1 = " + number1 + " ошибка т.к меньше минимального");
        long number3 = Integer.MIN_VALUE - 1L;
        System.out.println("теперь число Integer.MIN_VALUE - 1 = " + number3 + " правльный результат т.к. тип long");

        System.out.println("__________ex 22__________");
        double pi = 3.14;
        System.out.println("π = " + pi);
        pi = Math.PI;
        System.out.println("π = " + pi);

        System.out.println("__________ex 23__________");
        String alphabet = "а б в г д ж з и к л м н о п р с т у ф х ц ч ъ ы ь э ю я";
        System.out.println("Русский алфавит " + alphabet);

        System.out.println("Второй способ вывода алфавита с помощью цикла:");
        for (char alphabet1 = 'а'; alphabet1 <= 'я'; alphabet1++) {
            System.out.print(alphabet1 + ", ");
        }
        System.out.println();

        System.out.println("__________ex 24__________");
        long numbers = 9876543210L;
        System.out.println(numbers);

        System.out.println("__________ex 25__________");
        float e = 2.718F;
        System.out.println("Число Эйлера с точностью до третьего знака после точки\ne = " + e);
        float ee = (float) Math.E;
        System.out.println("Число Эйлера, взятое из класса Math если оно float\nee = " + ee);
        double eee = Math.E;
        System.out.println("Число Эйлера, взятое из класса Math если оно double\neee = " + eee);

        System.out.println("__________ex 26, 28__________");
        char c = 'a';
        System.out.println("английский символ " + c + " имеет цифровое значение а = " + (int)c);

        System.out.println("__________ex 27, 28__________");
        char cc = 'а';
        System.out.println("русский символ " + cc + " имеет цифровое значение а = " + (int)cc);
        //чтобы создать константу нужно впереди написать final
        final int cc1 = 'а';
        System.out.println(cc1);

        System.out.println("__________ex 29__________");
        char c25 = (char)(c + 25);
        System.out.println("25 символ в английской раскладке после a это " + c25);

        System.out.println("__________ex 30__________");
        char cc31 = (char) (cc + 31);
        System.out.println("31 символ в русской раскладке после a это " + cc31);
    }
}
