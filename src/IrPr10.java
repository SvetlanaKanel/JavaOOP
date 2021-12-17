public class IrPr10 {

    public static void printLineTask(int number) {
        System.out.println("\n________________________________ex" + number + "_______________________________");
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
    }



}
