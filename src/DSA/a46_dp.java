package DSA;

import java.util.Arrays;
import java.util.Scanner;

public class a46_dp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev2 = 0, prev1 = 1;
        for (int i = 2; i < n+1; i++) {
            int curri = prev1 + prev2;
            prev2 = prev1;
            prev1 = curri;
        }
        System.out.println(prev1);
    }
//    public static int f(int n, int[]dp){
//        if(n<=1){
//            return n;
//        } if(dp[n] != -1){
//            return dp[n];
//        }
//        return dp[n] = f(n-1,dp) + f(n-2, dp);
//    }
}
