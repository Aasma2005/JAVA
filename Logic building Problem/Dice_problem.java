// User function Template for Java
class Dice_problem {
    static int oppositeFaceOfDice(int n) {
        // code here
        int ans = 7 - n;
        return ans;
    }

    public static void main(String[] args)
    {
        int n = 2;
        Dice_problem sc=new Dice_problem();
        System.out.println(sc.oppositeFaceOfDice(n));
    }
}
