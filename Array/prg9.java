//product of array element

public class prg9 {
    public static int productEle(int[] arr, int num){

        int product=1;
        for(int i=0;i<num;i++){
            product=product*arr[i]; 
        }
        return product;
    }
    public static void main(String[] args) {

        int arr[]=new int[]{1,2,3,4};
        int num=arr.length;
        System.out.println(productEle(arr, num));

    }
}
