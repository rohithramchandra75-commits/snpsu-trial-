package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2 {
    public static void main(String[] args) throws IOException {
        String str;
        BufferedReader br=null;
        try{
            br= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter a string");
            str=br.readLine();
            System.out.println("entereed");
        }finally {
            br.close();
        }
    }
}
