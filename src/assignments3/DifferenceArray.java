package assignments3;

public class DifferenceArray {

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 6};
        int n = arr.length;

        int[] diff = new int[n];

        diff[0] = arr[0];
        for (int i = 1; i < n; i++) {
            diff[i] = arr[i] - arr[i - 1];
        }

        int L = 1;
        int R = 3;
        int val = 10;

        diff[L] += val;
        if (R + 1 < n) {
            diff[R + 1] -= val;
        }

        arr[0] = diff[0];
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + diff[i];
        }

        System.out.println("Updated Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}