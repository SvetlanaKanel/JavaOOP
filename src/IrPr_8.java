public class IrPr_8 {

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

    public static boolean isNumberEven(int number) {

        return (number % 2 == 0);
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

        int j1 = 14;
        System.out.println("Initial number\t\t" + j1);

        System.out.println("Even or odd\t\t\t" + evenOrOddNumber(j1) + "\n"
                + "Action\t\t\t\t" + getAction(j1) + "\n" + "New number\t\t\t" + checkNumber(j1));

        System.out.println("Test result\t\t\t" + assertIntegerResults(checkNumber(j1), 28));

        printLine(2);

        int age = 2;
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
