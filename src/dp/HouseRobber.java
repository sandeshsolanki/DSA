package dp;

public class HouseRobber {


    public static int rob(int[] arr)
    {
        int n = arr.length;

        if (n<2)
        {
            return arr[0];
        }

        int[] dp = new int[n];

        dp[0] = arr[0];
        dp[1] = Math.max(arr[0] , arr[1]);

        for (int i=2; i<n; i++)
        {
            dp[i] = Math.max(dp[i-2] + arr[i], dp[i-1]);
        }

        return dp[n-1];
    }

    public static void main(String[] args) {
        int[] arr = {2,7,3,1,4,2,1,8};
        System.out.println(rob(arr));
    }
}
