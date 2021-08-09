import java.util.Scanner;

/**
 * Created by JiaLe on 2021/8/8 14:36
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int N = Integer.parseInt(arr[0]);
        int L = Integer.parseInt(arr[1]);
        int K = Integer.parseInt(arr[2]);
        long[][] dp = new long[L + 1][N + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= L; i++) {
            for (int j = 1; j <= N; j++) {
                dp[i][j] = dp[i - 1][j - 1] * (N - j + 1);
                dp[i][j] += dp[i - 1][j] * (j - K);
                dp[i][j] %= 1000000009;
            }

        }
        System.out.println(dp[L][N]);
    }
}
