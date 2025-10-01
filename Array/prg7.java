//find minimum and maximum number in array

public class prg7 {
    public static void main(String[]main){
        int arr[]=new int[]{3,2,1,5,6};
        int maxValue=Integer.MIN_VALUE;
        int minValue=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<minValue){
                minValue=arr[i];
            }
            else if(arr[i]>maxValue){
                maxValue=arr[i];
            }
        }
        System.out.println(minValue+ ","+ maxValue);

    }
    
}
