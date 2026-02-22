

import java.util.*;
class Demo{
    public static void main(String[]args){

        List<String> list=new ArrayList<>();

        list.add("java");
        list.add("pythan");
        list.add("javascript");

        System.out.println("programming languages");

        for(String lang : list){
            System.out.println(lang);
        }

    }
}