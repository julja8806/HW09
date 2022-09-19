import java.util.Scanner;

public class Task02 {
    public static boolean pointOnCoordinateAxis(int x, int y, int x1, int y1, int x2, int y2) {
        return x <= x1 && x >= x2 && y <= y1 && y <= y2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your numbers: ");

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        boolean result = pointOnCoordinateAxis(x, y, x1, y1, x2, y2);
        String msg = result ? "Yes, The point with X Y coordinates is located inside" :
                "No, The point with X Y coordinates is not located inside";
        System.out.println(msg);
    }
}
