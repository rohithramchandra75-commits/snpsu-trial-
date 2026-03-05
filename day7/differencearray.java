package day7;

public class differencearray {
    public static void main(String[] args) {

        int[] arr = {2,3,4,5,6};
        int n = 5;

        int[] diff = new int[n];

        int L = 1;
        int R = 3;
        int val = 2;

        diff[L] += val;

        if (R + 1 < n) {
            diff[R + 1] -= val;
        }

        for (int i = 1; i < n; i++) {
            diff[i] = diff[i] + diff[i - 1];
        }

        System.out.println("Result");
        for (int i = 0; i < n; i++) {
            System.out.print(diff[i] + " ");
        }
    }
}