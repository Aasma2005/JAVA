import java.util.*;
public class prg3 {

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);

        int arr[]=new int[]{2,5,2,7,8,9,2};

        System.out.println("Enter the element");
        int num=sc.nextInt();

        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                count++;
            }
        }
        System.out.println("number"+" "+num+" "+"occured at"+" "+count+" "+"at index");


    }

    
}
