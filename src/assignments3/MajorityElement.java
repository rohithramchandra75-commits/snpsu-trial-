package assignments3;

public class MajorityElement {

    public static int findMajority(int[] arr) {
        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 1, 2, 2, 2};

        int majority = findMajority(arr);

        System.out.println("Majority Element: " + majority);
    }
}