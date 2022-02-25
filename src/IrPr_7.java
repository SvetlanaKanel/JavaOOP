public class IrPr_7 {

    public static void printLine(int number) {
        System.out.println("______________________________ex " + number + "_______________________________");
    }

    public static String assertIntegerResults(int actualNumber, int expectedNumber) {
        if (actualNumber == expectedNumber) {

            return "Passed";
        }
        return "Failed";
    }

    public static String assertStringResults(String actualResult, String expectedResult) {
        if (actualResult.equals(expectedResult)) {

            return "Passed";
        }
        return "Failed";
    }

    public static String assertBooleanResults(boolean actualResult, boolean expectedResult) {
        if (actualResult == expectedResult) {

            return "Passed";
        }

        return "Failed";
    }

    public static void printBooleanTest(boolean actualResult, boolean expectedResult) {
        System.out.println("Test result\t\t\t" + assertBooleanResults(actualResult, expectedResult));
    }

    public static boolean areEqual(int a1, int a2, int b1, int b2) {

        return ((a1 == a2) && (b1 == b2));
    }

    public static boolean isNotTrue(int a, int b) {

        return (!(a < b));
    }

    public static boolean areEqualFourTrees(String tree1, String tree2, String tree3, String tree4) {

        return ((tree1.equals(tree2)) || (tree3.equals(tree4)));
    }

    public static boolean areNotEqualTwoTrees(String tree1, String tree2) {

        return !tree1.equals(tree2);
    }

    public static boolean areNotFalseResults(int a, int b, int c, int d) {

        return !(a < b) && (c > d);
    }

    public static void ageForDriving(int age) {
        int legalAge = 16;
        if (age >= legalAge) {
            System.out.println("You can get a driver's license");
        } else {
            System.out.println("You can not get a driver's license");
        }
    }

    public static int getThreeOrFiveDividing(int number) {
        int result = 0;
        if (number % 3 == 0) {
            result += number;
        }
        if (number % 5 == 0) {
            result -= number;
        }
        return result;
    }

    public static void main(String[] args) {
        printLine(1);
        int a1 = 2, a2 = 2;
        int b1 = 7, b2 = 7;
        System.out.println(areEqual(a1, a2, b1, b1));
        //Test
        System.out.println("Test result\t\t" + assertBooleanResults(areEqual(a1, a2, b1, b2), true));

        printLine(2); //(!(15 < 3))

        System.out.println(isNotTrue(15, 3));
        System.out.println(assertBooleanResults(isNotTrue(15, 3), true));

        printLine(3);

        String s = "Сосна";
        String d = "Дуб";
        String v = "Вишня";
        String k = "Клён";

        System.out.println(areEqualFourTrees(s, d, v, k));

        boolean actualResult = areEqualFourTrees(s, d, v, k);
        boolean expectedResult = false;
        System.out.println(assertBooleanResults(actualResult, expectedResult));

        printLine(4);

        System.out.println("Не(\"Сосна\" = \"Дуб\");");
        System.out.println(areNotEqualTwoTrees("Сосна", "Дуб"));
        actualResult = areNotEqualTwoTrees("Сосна", "Дуб");
        expectedResult = true;
        printBooleanTest(actualResult, expectedResult);

        printLine(5);

        System.out.println("Не(15 < 3) И (10 > 20)");
        System.out.println(areNotFalseResults(15, 3, 10, 20));
        actualResult = areNotFalseResults(15, 3, 10, 20);
        expectedResult = false;
        printBooleanTest(actualResult, expectedResult);

        printLine(8);

        int age = 17;
        ageForDriving(age);

    }
}
