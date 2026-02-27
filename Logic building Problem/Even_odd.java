public class Even_odd {
    
    static boolean isEven(int n) {
        
       if(n%2==0){
           return true;
       }
       else{
           return false;
       }
        
    }
    public static void main(String[]args){
        int n=15;
        
        boolean result=isEven(n);
        System.out.println(result);
    }
}

