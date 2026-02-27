package list;
import java.util.*;
class swap{
    List<Integer> swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        List<Integer> list=new ArrayList<>();
        list.add(a);
        list.add(b);
        return list;
    }    public static void main(String[]args){
        int a=3;
        int b=9;
        swap sc=new swap();
        List<Integer> result=sc.swap(a,b);
        System.out.println(result);
    }
}