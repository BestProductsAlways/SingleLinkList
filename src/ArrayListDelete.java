package ArrayLlist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDelete {
    // Method to delete a specific value from the ArrayList
    public static void delete(ArrayList<Integer> list, int value) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == value) {
                iterator.remove();
                break; // Remove only the first occurrence
            }
        }
    }
}

