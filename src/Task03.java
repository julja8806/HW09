import java.util.Scanner;

public class Task03 {

    public static boolean checkEvenNumbers(int a, int b, int c) {
        return a % 2 == 0 && b % 2 == 0 && c % 2 == 0;
    }

    public static boolean checkOddNumbers(int a, int b, int c) {
        return a % 2 != 0 && b % 2 != 0 && c % 2 != 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your numbers: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean result = checkEvenNumbers(a, b, c);

        String msg = result ? "Yes, all numbers are even" : "No, some numbers are not even";

        System.out.println(msg);

        result = checkOddNumbers(a, b, c);

        msg = result ? "Yes, all numbers are odd" : "No, some numbers are not odd";

        System.out.println(msg);
    }
}

