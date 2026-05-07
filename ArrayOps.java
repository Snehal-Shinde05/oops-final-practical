import java.util.Scanner;

class ArrayOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;

        do {
            System.out.println("\n1.Display");
            System.out.println("2.Maximum");
            System.out.println("3.Minimum");
            System.out.println("4.Sum");
            System.out.println("5.Average");
            System.out.println("6.Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            int max = arr[0], min = arr[0], sum = 0;

            switch(choice) {
                case 1:
                    System.out.print("Elements: ");
                    for(int x : arr)
                        System.out.print(x + " ");
                    System.out.println();
                    break;

                case 2:
                    for(int x : arr)
                        if(x > max) max = x;
                    System.out.println("Maximum = " + max);
                    break;

                case 3:
                    for(int x : arr)
                        if(x < min) min = x;
                    System.out.println("Minimum = " + min);
                    break;

                case 4:
                    for(int x : arr)
                        sum += x;
                    System.out.println("Sum = " + sum);
                    break;

                case 5:
                    for(int x : arr)
                        sum += x;
                    System.out.println("Average = " + (sum / (double)n));
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while(choice != 6);
    }
}