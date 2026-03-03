class Solution {
    public void printDiamond(int n) {

        // Upper half
        for(int i = 1; i <= n; i++) {

            // spaces
            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j = 1; j <= (2*i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for(int i = n-1; i >= 1; i--) {

            // spaces
            for(int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // stars
            for(int j = 1; j <= (2*i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = 3;
        Solution sc = new Solution();
        sc.printDiamond(n);
    }

    public char[] oppositeFaceDice(int n) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'oppositeFaceDice'");
    }
}