import java.util.*;

class Geeks {
  
    public static void main(String args[])
    {
        List<String> al = new ArrayList<>();

        // Adding elements to object of List interface Custom elements
        al.add("Geeks");
        al.add("Geeks");
        al.add(1, "For");

        System.out.println(al);
    }
}