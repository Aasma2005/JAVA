public class sum_og_digit {
    public static void main(String[] args) {
        int n=1234;
        int sum=0;
        while(n!=0){
            int reminder=n%10;
            sum+=reminder;
            n/=10;
        }
        System.out.println(sum);

    }
}
