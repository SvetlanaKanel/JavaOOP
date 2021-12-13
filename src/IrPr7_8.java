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

    public static boolean isNumberEven(int number) {
        if (number % 2 == 0) {

            return true;
        }
        return false;
    }

    public static String evenOrOddNumber(int number) {
        if (isNumberEven(number)) {

            return "even";
        }
        return "odd";
    }

    public static int checkNumber(int number) {
        if (isNumberEven(number)) {
            number *= 2;
        }
        return number;
    }

    public static String getAction(int number) {
        if (isNumberEven(number)) {

            return "multiply by 2";
        } else {

            return "no action";
        }

    }

    public static String isAgeForVoting(int age) {
        if (age >= 18) {
            return "You can vote.";
        }
        return "You cannot vote.";
    }

    public static String isAgeForDriving(int age) {
        if (age >= 16) {
            return "You can drive.";
        }
        return "You cannot drive.";
    }

    public static String isAgeForSchool(int age) {
        if (age >= 5) {
            return "You can go to school.";
        }
        return "You cannot go to school.";
    }

    public static String gradeRemark(int grade) {
        if (grade == 5) {
            return "Выдать похвальную грамоту и перевести в следующий класс.";
        } else if (grade == 4) {
            return "Перевести в следующий класс.";
        } else if (grade == 3) {
            return "Дать задание на лето и перевести в следующий класс.";
        } else if (grade == 2) {
            return "Вызвать родителей и оставить в текущем классе на второй год.";
        } else
            return "Ошибка ввода данных.";
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

        printLine(1);

        int j1 = 14;
        System.out.println("Initial number\t\t" + j1);

        System.out.println("Even or odd\t\t\t" + evenOrOddNumber(j1) + "\n"
                + "Action\t\t\t\t" + getAction(j1) + "\n" + "New number\t\t\t" + checkNumber(j1));

        System.out.println("Test result\t\t\t" + assertIntegerResults(checkNumber(j1), 28));

        printLine(2);

        age = 2;
        System.out.println("Age\t\t\t" + age);
        System.out.println(isAgeForSchool(age) + " " + isAgeForDriving(age) + " " + isAgeForVoting(age));
        System.out.println("Test result\t\t" + assertStringResults(
                isAgeForSchool(age) + " " + isAgeForDriving(age) + " " + isAgeForVoting(age),
                "You cannot go to school. You cannot drive. You cannot vote.")
        );

        printLine(3);

        int grade = 5;
        System.out.println("Оценка\t\t\t" + grade);
        System.out.println("Сообщение:\t\t" + gradeRemark(grade));
        System.out.println("Test result\t\t"
                + assertStringResults(gradeRemark(grade),
                "Выдать похвальную грамоту и перевести в следующий класс.")
        );

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
