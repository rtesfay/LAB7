public class LoopWhileQuestion2b {
        public static void main(String[] args) {
            int sum = 0;
            int i;
            while ((i%5==0)&& (i <= 50));
            do {
                sum += sum;
                i++;
            }
            System.out.println("The sum is " + sum);

        }

    }

