import java.util.Scanner;

public class PrimesQuestion5 {
        public static void main(String[] args) {
            int n;
            Scanner keyboard = new Scanner(System.in);
            n= keyboard.nextInt();
            for(int i=2; i<=n; i++){
                int x;
                int count=0;
                System.out.println("Enter n numbers one by one");
                if(((n%n)==0)&&(n%x)!=0){
                    count++;
                }
            }
        }
    }


