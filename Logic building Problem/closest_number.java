class  closest_number{
    static int closestNumber(int n, int m) {
        // code here
        int q = n / m;

        int n1 = m * q;

        int n2;
        if (n * m > 0)
            n2 = m * (q + 1);
        else
            n2 = m * (q - 1);

        if (Math.abs(n - n1) < Math.abs(n - n2))
            return n1;
        else if (Math.abs(n - n1) > Math.abs(n - n2))
            return n2;
        else
            return (Math.abs(n1) > Math.abs(n2)) ? n1 : n2;
    }
    public static void main(String[]args){
        int n=13;
        int m=4;
        closest_number sc=new closest_number();
        System.out.println(sc.closestNumber(n,m));
    }
}