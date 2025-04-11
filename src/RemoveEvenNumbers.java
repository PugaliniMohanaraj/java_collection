import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        // Get numbers from user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            int num = scanner.nextInt();
            numbers.add(num);
        }

        // Remove even numbers using Iterator
        removeEvenNumbers(numbers);

        // Display the result
        System.out.println("List after removing even numbers: " + numbers);
        scanner.close();
    }

    // Method to remove even numbers safely
    public static void removeEvenNumbers(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int num = it.next();
            if (num % 2 == 0) {
                it.remove();
            }
        }
    }
}

//Why is it not safe to remove elements
//from a list during a for-each loop?

//The for-each loop uses an internal iterator.

//for (int num : list) {
//        if (num % 2 == 0) {
//        list.remove(num);
//    }
//            }

