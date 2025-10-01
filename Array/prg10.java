//Search element in array

public class prg10 {
    public static int SearchEle(int[] arr,int num ,int x){
        int index=-1;
        for(int i=0;i<num;i++){
            if(arr[i]==x){
                index=i;
            }
        }
        return index;
    }
    public static void main(String[]args){

        int arr[]=new int[]{1,2,3,4};
        int num=arr.length;
        int x=3;
        System.out.println(SearchEle(arr, num, x));
    }
}
