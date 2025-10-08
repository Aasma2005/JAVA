//concat the string

public class prg6 {
    public static void main(String[] args) {
        String str1=new String("Aasma");
        System.out.println(str1);
        String str2=new String("Shaikh");
        System.out.println(str2);

        str1=str1.concat(str2);
        System.out.println(str1);
        System.out.println(str1.length());
    }
    
}
