import java.util.Scanner;

public class ErrorsQuestion1b {
        public static void main(String[] args) {
            int sum = 0;
            int num;
            Scanner scanner = new Scanner(System.in);
            do {
                num = Scanner.nextInt();
                sum += num;
            }
            while (sum>100000);
        }
    }



