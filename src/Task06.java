import java.util.Scanner;

public class Task06 {
    public static boolean checkEvenNumbers(int a, int b, int c) {
        return a % 2 == 0 && b % 2 == 0 || a % 2 == 0 && c % 2 == 0 ||
                b % 2 == 0 && c % 2 == 0;
    }

    public static boolean checkOddNumbers(int a, int b, int c) {
        return a % 2 != 0 && b % 2 != 0 || a % 2 != 0 && c % 2 != 0 ||
                b % 2 != 0 && c % 2 != 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your numbers: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean result = checkEvenNumbers(a, b, c);

        String msg = "The most numbers are odd";
        if (a % 2 == 0 && b % 2 == 0 || a % 2 == 0 && c % 2 == 0 ||
                b % 2 == 0 && c % 2 == 0) {msg = "The most numbers are even";

        } 

        System.out.println(msg);

        result = checkOddNumbers(a, b, c);

        msg = "The most numbers are even";

        if (a % 2 != 0 && b % 2 != 0 || a % 2 != 0 && c % 2 != 0 ||
                b % 2 != 0 && c % 2 != 0) {msg = "The most numbers are odd";

        }
        System.out.println(msg);
    }

}
