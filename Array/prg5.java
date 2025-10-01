public class prg5 {
    

    public static void main(String[]args){
        int arr[]=new int[]{-2,5,-6,7,-3,8};

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr[i]=arr[i]*arr[i];
                System.out.println(arr[i]);

            }
            else if(arr[i]>0){
                System.out.println(arr[i]);
            }
        }
    }
}
