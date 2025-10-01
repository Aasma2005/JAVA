//Find largest element in array

public class prg8 {
    public static void main(String[]args){
        int arr[]=new int[]{1,8,7,56,90};
        int maxEle=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxEle){
                maxEle=arr[i];
            }
        }
        System.out.println(maxEle);
    }
    
}
