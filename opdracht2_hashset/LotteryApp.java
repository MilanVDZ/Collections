package opdracht2_hashset;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LotteryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert 6 numbers between 1 and 45: ");
        Set<Integer> numbers = new HashSet<>();
        int number;
        for (int i = 0; i < 6; i++) {
            number = scanner.nextInt();
            while (number > 45 || number < 1 || numbers.contains(number)) {
                if (number > 45) {
                    System.out.println("Please enter a number under 45!");
                } else if (number < 1) {
                    System.out.println("Please enter a number higher than 0!");
                } else if (numbers.contains(number))
                    System.out.println("Enter a non existant number!");
                    number = scanner.nextInt();
            }
            numbers.add(number);
        }
        System.out.println(numbers);
    }
}
