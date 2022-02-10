public class IrPr7_8 {

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

    public static String countNumberOfDigits(int number) {
        if (number >= -9 && number <= 9) {

            return "It's one-digit number";
        } else if (number >= -99 && number < -9 || number > 9 && number <= 99) {

            return "two-digit number";
        } else if (number >= -999 && number < -99 || number > 99 && number <= 999) {

            return "three-digit number";
        } else if (number >= -9999 && number < -999 || number > 999 && number <= 9999) {

            return "four-digit number";
        } else if (number >= -99999 && number < -9999 || number > 9999 && number <= 99999) {

            return "five-digit number";
        } else if (number >= -999999 && number < -99999 || number > 99999 && number <= 999999) {

            return "six-digit number";
        }
        return "Invalid input. Please, enter Integer";
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
//****************************************************************************************

        printLine(4);

        int number7 = 1654;
        System.out.println(number7);
        System.out.println(countNumberOfDigits(number7));

        printLine(5);

        int number = 10;
        int expectedResult2 = -10;

        int actualResult2 = getThreeOrFiveDividing(number);

        System.out.println("Number\t\t\t" + number + "\n"
                + "Expected result\t\t" + expectedResult2 + "\n"
                + "Actual result\t\t" + actualResult2 + "\n"
                +assertIntegerResults(actualResult2, expectedResult2));
    }
}
