/*Return yhe count of pair (i,j) with arr[i]+arr[j]=k
Arr={3,5,2,1,-3,7,8,15,6,13};
K=10;
output=6
*/
public class prg13 {

    public static int PairCount(int arr[],int num,int k,int itr){
        int count=0;
       
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                itr++;
                if(arr[i] != arr[j]){
                    if(arr[i]+arr[j]==k){
                        count++;
                    }
                }
            }
        }
        System.out.println("itration :"+itr);
        return count;  
    }
    public static void main(String[]args){
        int arr[]=new int[]{3,5,2,1,-3,7,8,15,6,13};
        int num=arr.length;
        int k=10;
        int itr=0;
        System.out.println(PairCount(arr, num, k, itr));      
    }   
}
