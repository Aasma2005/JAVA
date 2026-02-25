import java.util.HashSet;
import java.util.Set;

public class removing_element {
     public static void main(String[] args)
    {
        // Declaring object of Set of type String
        Set<String> h = new HashSet<String>();

        // Elements are added using add() method, Custom input elements
        h.add("A");
        h.add("B");
        h.add("C");
        h.add("B");
        h.add("D");
        h.add("E");
        
        System.out.println("Initial HashSet " + h);

        // Removing custom element using remove() method
        h.remove("B");
        h.removeAll(h);
        System.out.println("After removing element " + h);
    }
}
