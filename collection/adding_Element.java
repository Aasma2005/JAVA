import java.util.ArrayList;
import java.util.Collection;

public class adding_Element {
    public static void main(String[] args) {
        
        Collection<Integer> number=new ArrayList<>();

        number.add(10);
        number.add(20);
        number.add(30);

        Collection<Integer> morenumber=new ArrayList<>();
        morenumber.add(40);
        morenumber.add(80);

          number.addAll(morenumber);
        System.out.println(number);

    }
    
}
