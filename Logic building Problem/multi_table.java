import java.util.ArrayList;

public class multi_table {
    // User function Template for Java

    static ArrayList<Integer> getTable(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= 10; i++){
            list.add(n * i);
        }
        
        return list;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> result = getTable(9);
        System.out.println(result);
    }
}

