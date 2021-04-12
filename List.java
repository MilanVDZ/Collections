import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five numbers: ");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(scanner.nextInt());
        numbers.add(scanner.nextInt());
        numbers.add(scanner.nextInt());
        numbers.add(scanner.nextInt());
        numbers.add(scanner.nextInt());

        System.out.println("The five numbers are: " + numbers);

        Collections.sort(numbers);
        System.out.println("The five numbers in ascending order" + numbers);

        System.out.println();

        int total = 0;
        int avg = 0;
        for(int i = 0; i < numbers.size(); i++){
            total += numbers.get(i);
            avg = total / numbers.size();
        }

        System.out.println("The average is: " + avg);
        System.out.println("The total is: " + total);
    }
}
