import java.util.Scanner;

public class PerfectNumbersQuestion6 {
        public static void main(String[] str) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a positive integer");
            int n = scan.nextInt();

            if (n <= 0) {
                System.out.println("The number is NOT positive integer");
            } else {
                int sum = 0;

                System.out.print("\n Its proper divisors are: ");

                for (int i = 1; i < n; i++) {
                    if (n % i == 0) {
                        sum = sum + i;
                        System.out.print(i + " ");// to print space between the numbers
                    }
                }// end of for loop

                System.out.println("\n===========================");

                if (sum == n) {
                    System.out.println("The number is PERFECT number");
                } else {
                    System.out.println("The number is NOT PERFECT number");
                }
            }
        }
    }




}
