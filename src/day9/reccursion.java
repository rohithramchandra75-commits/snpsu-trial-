package day9;

import java.util.Scanner;

public class reccursion {
    static void function(){
        System.out.println("Hello World");
        function();
    }
    public static void main(String[] args) {
        function();
    }
}
