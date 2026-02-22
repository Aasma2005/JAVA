import java.util.ArrayList;
import java.util.List;

public class Accesing_Element {
    public static void main(String[] args){
        
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        System.out.println("Colors List: " + colors);

        // Accessing elements by index
        String firstColor = colors.get(0);
        String lastColor = colors.get(colors.size() - 1);

        System.out.println("First Color: " + firstColor);
        System.out.println("Last Color: " + lastColor);
   
    }
    
}
