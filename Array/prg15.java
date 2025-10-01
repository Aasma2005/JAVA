//print the sum between start and end

public class prg15 {

    public static int SumEle(int arr[], int num, int start, int end ){
        int sum=0;

        for(int i=start;i<=end;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[]args){
        int arr[]=new int[]{-3,6,2,4,5,2,8,-9,3,1};
        int start =1;
        int end=3;
        int num=arr.length;

        System.out.println(SumEle(arr, num, start, end));
    }
    
}
