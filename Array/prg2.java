import java.util.*;
public class prg2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[]{1,5,9,8,7,6};

        System.out.println("enter number to search in array");
        int num=sc.nextInt();
        

        int index=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                index=i;
                System.out.println(index);

            }
    }
    if (index != -1) {
            System.out.println("Element " + num + " found at index: " + index);
        } else {
            System.out.println("Element " + num + " not found in array.");
        }
}
}
