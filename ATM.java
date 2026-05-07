import java.util.Scanner;

class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000;
        int choice;

        do {
            System.out.println("\n1.Check Balance \n2.Deposit \n3.Withdraw \n4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            try {
                switch(choice) {
                    case 1:
                        System.out.println("Current Balance = " + balance);
                        break;

                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double d = sc.nextDouble();
                        if(d <= 0) throw new IllegalArgumentException();
                        balance += d;
                        System.out.println("Amount Deposited!");
                        System.out.println("Updated Balance = " + balance);
                        break;

                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        double w = sc.nextDouble();
                        if(w > balance) throw new ArithmeticException();
                        balance -= w;
                        System.out.println("Amount Withdrawn!");
                        System.out.println("Remaining Balance = " + balance);
                        break;

                    case 4:
                        System.out.println("Thank You!");
                        break;

                    default:
                        System.out.println("Invalid choice");
                }
            }
            catch(ArithmeticException e) {
                System.out.println("Insufficient Balance!");
            }
            catch(IllegalArgumentException e) {
                System.out.println("Invalid Amount!");
            }

        } while(choice != 4);
    }
}