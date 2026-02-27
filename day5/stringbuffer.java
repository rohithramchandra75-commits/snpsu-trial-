package day5;

public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        System.out.println("old string: " + sb);
        sb.append("new");
        System.out.println("new string: " + sb);
    }
    public void stringInsert(){
        StringBuilder sb = new StringBuilder("hello");
        System.out.println("old string: " + sb);
        System.out.println("new string: " + sb);
        sb.insert(0,"new");
        System.out.println("new string: " + sb);
    }
}
