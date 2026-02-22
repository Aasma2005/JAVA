
import java.util.*;
public class list_updatingElement {
        public static void main(String args[])
    {
        // Creating an object of List interface
        List<String> al = new ArrayList<>();

        // Adding elements to object of List class
        al.add("Geeks");
        al.add("Geeks");
        al.add(1, "Geeks");

        System.out.println("Initial ArrayList " + al);

        // Setting (updating) element at 1st index using set() method
        al.set(1, "For");

        System.out.println("Updated ArrayList " + al);
    }
} 

