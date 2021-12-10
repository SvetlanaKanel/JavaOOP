public class IrPr1_2 {

    public static void main(String[] args) {
        System.out.println("ex 12");
        byte a = 10;
        byte b = 20;

        System.out.println("ex 13");
        short s = 100;
        short t = 100;

        System.out.println("ex 14");
        int i = 1000000;

        System.out.println("ex 15");
        long phoneNumber = 89261111111L;

        System.out.println("ex 16");
        float f = 100.101F;

        System.out.println("ex 17");
        double d = 1000.10000001;

        System.out.println("ex 18");
        String myNameInSlack = "Svetlana Kanel";

        System.out.println("ex 19");
        int sum = a + b;
        int sum2 = a + (int)d;
        double sum3 = a + d;
        System.out.println("sum2 = " + sum2);
        System.out.println("sum3 = " + sum3);

        System.out.println("ex 20");
        int product = s * t;

        System.out.println("ex 21");
        double quotient = i / 50;

        System.out.println("ex 22");
        float reminder = f % 100;
        System.out.println(reminder);

        System.out.println("ex 23");
        double sum1 = i + d;

        System.out.println("ex 24");
        System.out.println("myNameInSlack = " + myNameInSlack);
        System.out.println("phoneNumber = " + phoneNumber);

        System.out.println("ex 25");
        System.out.println("::   ::  ::::::  ::      ::       :::::  ");
        System.out.println("::   ::  ::      ::      ::      ::   :: ");
        System.out.println(":::::::  ::::::  ::      ::      ::   :: ");
        System.out.println("::   ::  ::      ::      ::      ::   :: ");
        System.out.println("::   ::  ::::::  ::::::  ::::::   :::::  ");

        System.out.println("ex 26");
        int yob = 1979;
        int nowYear = 2021;

        String text1 = "Если человек родился в ";
        String text2 = " году, то его возраст ";
        System.out.println(text1 + yob + text2 + (nowYear - yob));

        yob = 1981;
        System.out.println(text1 + yob + text2 + (nowYear - yob));
    }
}
