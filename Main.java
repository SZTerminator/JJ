
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sequense element");
        int number = sc.nextInt();
        double sum = 0;
        double answer = 1 - ( 1 / Math.pow(1 + number,0.25)  );
        System.out.println(answer);
        double temp = 1;
        for (int i = 1;i <= number; i++){
            temp = temp * (4 * i - 3 ) / (4 * i);
            if (i % 2 == 1){
                sum = sum + temp;
            }
            else {
                sum = sum - temp;
            }
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}