package ArrayLlist;

import java.util.ArrayList;
import java.util.Arrays;

public class TestingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(30, 10, 20));
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        System.out.println("Before deletion: " + numbers);

        // Deleting elements using the delete method from ArrayListDelete class
        ArrayListDelete.delete(numbers, 20);
        System.out.println("After deleting 20: " + numbers);

        ArrayListDelete.delete(numbers, 50);
        System.out.println("After deleting 50: " + numbers);

        ArrayListDelete.delete(numbers, 100); // Attempting to delete a non-existent element
        System.out.println("After attempting to delete 100: " + numbers);
    }
}

