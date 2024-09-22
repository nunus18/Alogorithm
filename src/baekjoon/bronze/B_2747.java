package baekjoon.bronze;

import java.util.Scanner;

public class B_2747 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[45];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){

            dp[i]=dp[i-1]+dp[i-2];

        }
        System.out.println(dp[n]);




    }
}