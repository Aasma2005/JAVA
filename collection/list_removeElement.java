import java.util.*;
public class list_removeElement {
    public static void main(String args[])
    {

        // Creating List class object
        List<String> al = new ArrayList<>();

        // Adding elements to the object Custom inputs
        al.add("Geeks");
        al.add("Geeks");
        al.add(1, "For");

        System.out.println("Initial ArrayList " + al);

        // Now remove element from the above list present at 1st index
        al.remove(1);

        System.out.println("After the Index Removal " + al);

        // Now remove the current object from the updated List
        al.remove("Geeks");
        
        System.out.println("After the Object Removal " + al);
    }
}
