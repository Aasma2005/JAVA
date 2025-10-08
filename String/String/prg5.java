public class prg5 {
    public static void main(String[] args) {
        StringBuffer sb =new StringBuffer("Aasma");
        System.out.println(sb);
        System.out.println(System.identityHashCode(sb));
        System.out.println(sb.capacity());

        sb=sb.append("shaikh");
        System.out.println(sb);
        System.out.println(System.identityHashCode(sb));
        System.out.println(sb.capacity()
        );

    }
    
}
