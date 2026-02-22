import java.util.ArrayList;
import java.util.Collection;

public class Removing_Element {
    public static void main(String[] args) {
        
        Collection<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("mango");
        fruits.add("guava");
        fruits.add("coconant");

        System.out.println("Before removal"+ fruits);

        fruits.remove("mango");
        System.out.println("After removal"+ fruits);

        Collection<String> toRemove = new ArrayList<>();
        toRemove.add("Apple");
        toRemove.add("Banana");

        fruits.removeAll(toRemove);
        System.out.println("After removeAll(): " + fruits);
    
    }
    
}
