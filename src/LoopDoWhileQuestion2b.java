public class LoopDoWhileQuestion2b {
        int sum = 0;
        int i;
        do {
            sum += sum;
            i++;
            while ((i % 5 == 0) && (i <= 50)) {
                System.out.println("The sum is " + sum);

            }

        }
    }


