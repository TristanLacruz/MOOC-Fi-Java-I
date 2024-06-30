
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        ArrayList<Integer> myList = new ArrayList<>();

        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            myList.add(input);
        }

        double sum = 0;
        for (int element : myList) {
            sum += element;
        }
        double average = sum / myList.size();
        System.out.println("Average: " + average);
    }
}
