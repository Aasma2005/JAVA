class ArrayDemo{
    public static void main(String[]args){
        int arr[]=new int[]{10,20,30,40,50};
        int add=0;

        for(int i=0;i<arr.length;i++){
            add=arr[i]+15;
            System.out.print(add+" ");
            
        }
    }
}