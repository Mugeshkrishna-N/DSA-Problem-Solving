import java.util.Scanner;

public class Main {
    public static boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        
        // Empty pattern matches empty string
        dp[0][0] = true;
        
        // Handle patterns with '*' at the beginning
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }
        
        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                } else {
                    dp[i][j] = dp[i - 1][j - 1] && (s.charAt(i - 1) == p.charAt(j - 1));
                }
            }
        }
        
        return dp[m][n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the string and pattern
        String s = scanner.nextLine();
        String p = scanner.nextLine();
        
        // Check if the pattern matches the string
        boolean result = isMatch(s, p);
        
        // Output the result
        System.out.println(result);
        
        scanner.close();
    }
}
