import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            int a, b, choose;
            Scanner in = new Scanner(System.in);

            System.out.print("A: ");
            a = in.nextInt();

            System.out.print("B: ");
            b = in.nextInt();

            System.out.print("Enter your selection:\n" +
                    "[1] for Addition\n" +
                    "[2] for subtraction\n" +
                    "[3] for Multiplication\n" +
                    "[4] for division:");
            choose = in.nextInt();

            switch (choose) {
                case 1:
                    System.out.println(a + b);
                    break;
                case 2:
                    System.out.println(a - b);
                    break;
                case 3:
                    System.out.println(a * b);
                    break;
                case 4:
                    System.out.println(a / b);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + choose);
            }
        }
    }
}

