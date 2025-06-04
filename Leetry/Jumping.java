package Leetry;

class Jumping {
    public static void main(String[] args) {
        System.out.println(canReach("011010",2,3));
    }
    public static boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        if (s.charAt(n - 1) != '0') return false;

        boolean[] dp = new boolean[n];
        dp[0] = true;
        int preSum = 0;

        for (int i = 1; i < n; i++) {
            // Add dp[i - minJump] if within bounds
            if (i >= minJump) {
                preSum += dp[i - minJump] ? 1 : 0;
            }

            // Remove dp[i - maxJump - 1] if it goes out of window
            if (i > maxJump) {
                preSum -= dp[i - maxJump - 1] ? 1 : 0;
            }

            dp[i] = (s.charAt(i) == '0' && preSum > 0);
        }

        return dp[n - 1];
    }

}