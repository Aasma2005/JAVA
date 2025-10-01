//Rverse the array 

public class prg14 {
     
    public static int[] ReverseArray(int arr[], int num){
        int i=0;
        int j=num-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--; 
        }
        return arr;
    }
    public static void main(String[]args){
        int arr[]=new int[]{8,4,1,3,9,2,6};
        int num=arr.length;
        ReverseArray(arr, num);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }     
    } 
}
