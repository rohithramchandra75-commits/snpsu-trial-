package day15;

public class Tabulation {
    public static void main(String[] args) {
        int n = 100;

        // Corrected: n + 1 to accommodate index 'n'
        long[] dp = new long[n + 1];

        dp[0] = 0;
        if (n >= 1) {
            dp[1] = 1;
        }

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println("Fibonacci ");
        for (int i = 1; i <= n; i++) {
            System.out.println(dp[i]);
        }
    }
}
