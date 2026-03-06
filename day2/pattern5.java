public class pattern5 {
    public static void main(String[] args) {
        int rows;
        int cols;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 && j % 3 != 0) {
                    System.out.print(" * ");
                } else if (i == 1 && j % 3 == 0) {
                    System.out.print(" * ");
                } else if (i - j == 2) {
                    System.out.print(" * ");
                } else if (i + j == 8) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}