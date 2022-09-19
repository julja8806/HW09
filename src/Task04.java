import java.util.Scanner;

public class Task04 {
    public static boolean checkEvenNumbers(int a, int b, int c) {
        return a % 2 == 0 || b % 2 == 0 || c % 2 == 0;
    }

    public static boolean checkOddNumbers(int a, int b, int c) {
        return a % 2 != 0 || b % 2 != 0 || c % 2 != 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your numbers: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean result = checkEvenNumbers(a, b, c);

        String msg = "All numbers are odd";
        if (a % 2 == 0) {  msg = "A is even";


        } else if (b % 2 == 0) {msg = "B is even";

        } else if (c % 2 == 0) {msg = "C is even";

        }

        System.out.println(msg);

        result = checkOddNumbers(a, b, c);

        msg = "All numbers are even";

        if (a % 2 != 0) {msg = "A is odd";

        } else if (b % 2 != 0) {msg = "B is odd";

        } else if (c % 2 != 0) {msg = "C is odd";

        }
        System.out.println(msg);
    }

}