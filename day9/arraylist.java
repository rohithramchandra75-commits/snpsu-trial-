package day9;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(0));
        System.out.println(list.remove(0));
        System.out.println(list.contains(1));

        for(Object i : list){
            System.out.println(i);
        }
    }
}
