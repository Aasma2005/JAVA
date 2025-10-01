//

public class prg17 {
    public static void main(String[]args){
        char arr[]=new char[]{'a','b','e','g','a','g'};
        int count=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]=='a' && arr[j]=='g'){
                    count++;
                }
            }
            
        }
        System.out.println(count);
    }
    
}
