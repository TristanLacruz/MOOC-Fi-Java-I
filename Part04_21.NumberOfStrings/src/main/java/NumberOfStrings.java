
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cont = 0;
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            cont++;
        }       
        System.out.println(cont);
    }
}
