package day6;

import day5.stringbuffer;

import java.io.IOException;

public class checkedexception {
    static void readFile() throws IOException{
        throw new IOException("File not found");
    }
    static void display() throws IOException{
        readFile();
    }
    static void show()throws IOException{
        display();
    }
    public static void main(String[] args) throws IOException {
        try{
            display();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
