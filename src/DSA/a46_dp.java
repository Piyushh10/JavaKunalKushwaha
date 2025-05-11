package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class a46_dp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(f(n, dp));
    }
    public static int f(int n, int[]dp){
        if(n<=1){
            return n;
        } if(dp[n] != -1){
            return dp[n];
        }
        return dp[n] = f(n-1,dp) + f(n-2, dp);
    }

}
