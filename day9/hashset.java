package day9;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<String>();
        hset.add("a");
        hset.add("b");
        hset.add("c");
        hset.add("d");

        System.out.println(hset);
        System.out.println(hset.contains("a"));
        System.out.println(hset.remove(hset.iterator().next()));
        System.out.println(hset);
        System.out.println(hset.size());
        System.out.println(hset.size());
        System.out.println(hset.isEmpty());

        for(Object i : hset)
            {
            System.out.println(i);
            }
    }
}
