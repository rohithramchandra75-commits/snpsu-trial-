package day8;

import java.util.Scanner;

public class linearsearch {

    static int linearsearch(int key, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key");
        int key = sc.nextInt();

        int result = linearsearch(key, arr);

        if (result != -1) {
            System.out.println("Key " + key + " found at index " + result);
        } else {
            System.out.println("Not found");
        }

        sc.close();
    }
}