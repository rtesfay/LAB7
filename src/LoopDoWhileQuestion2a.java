public class LoopDoWhileQuestion2a {
        public static void main(String[] args) {
            int sum = 0;
            int i;

            do {
                sum += sum;
                i++;
                while (i <= 100) {
                    System.out.println("The sum is " + sum);

                }

            }
        }
    }

