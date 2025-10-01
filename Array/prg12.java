//count the number of element at least 1 element than itself

public class prg12 {
    public static int CountEle(int[] arr,int num){
        int count=0;
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(arr[i]<arr[j]){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[]args){
        int arr[]=new int[]{2,5,1,4,8,0,8,1,3,8};
        int num=arr.length;
        System.out.println(CountEle(arr, num));
    }
    
}
