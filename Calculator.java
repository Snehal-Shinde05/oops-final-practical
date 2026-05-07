import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- CALCULATOR ---");
            System.out.println("1.Add  \n2.Subtract  \n3.Multiply  \n4.Divide  \n5.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if(choice >= 1 && choice <= 4) {
                System.out.print("Enter two numbers: ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();

                switch(choice) {
                    case 1: System.out.println("Result = " + (a+b)); break;
                    case 2: System.out.println("Result = " + (a-b)); break;
                    case 3: System.out.println("Result = " + (a*b)); break;
                    case 4:
                        if(b!=0) System.out.println("Result = " + (a/b));
                        else System.out.println("Divide by zero!");
                        break;
                }
            }
        } while(choice != 5);

        System.out.println("Exited Calculator");
    }
}