
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        double num = num1+num2;
        double numsqrt = Math.sqrt(num);
        System.out.println(numsqrt);
    }
}
