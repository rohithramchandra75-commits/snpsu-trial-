package assignments3;

public class NegativePositivePartition {

    static void partitionArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (arr[left] < 0 && left < right) {
                left++;
            }

            while (arr[right] >= 0 && left < right) {
                right--;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {3, -2, 5, -7, 1, -4};

        partitionArray(arr);

        System.out.println("Array after partition:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}