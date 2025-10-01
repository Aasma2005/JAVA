//Build array leftmax of size N leftmax of i contain the maximum for yhe index 0 to index i

public class prg16 {
    public static void main(String[]args){

    int arr[]=new int[]{1,2,3,4};
    int[] leftmax=new int[arr.length];
     int maxEle=Integer.MIN_VALUE;

    for(int i=0;i<=arr.length;i++){
        
        if(maxEle<arr[i]){
            maxEle=arr[i];
    }
        leftmax[i]=maxEle;
}
    for(int i=0;i<=arr.length;i++){
    System.out.println(leftmax[i]);
}
    }
    
}
