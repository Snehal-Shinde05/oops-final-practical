import java.util.Scanner;

class OverloadDemo {
    static int power(int a, int b) {
        return (int)Math.pow(a, b);
    }

    static double power(double a, double b) {
        return Math.pow(a, b);
    }

    static int abs(int a) {
        return Math.abs(a);
    }

    static double abs(double a) {
        return Math.abs(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer number: ");
        int x = sc.nextInt();

        System.out.print("Enter power: ");
        int y = sc.nextInt();

        System.out.println("Power (int) = " + power(x, y));
        System.out.println("Absolute (int) = " + abs(x));

        System.out.print("\nEnter decimal number: ");
        double d = sc.nextDouble();

        System.out.println("Absolute (double) = " + abs(d));
        System.out.println("Power (double) = " + power(d, 2));
    }
}