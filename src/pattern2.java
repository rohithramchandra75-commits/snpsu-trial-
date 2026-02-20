public class pattern2 {
    public static void main() {
        for(int i=0;i<10;i++) {
            for (int j = 0; j < 10-i-1; j++) {
                System.out.print("*");
            }
            for(int k=2*i+1;k<10;k++) {}
            System.out.println();
        }
    }

}
