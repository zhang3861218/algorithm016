package week09.homework;

/**
 * 　　* @description: TODO
 * 　　* @throws
 * 　　* @author zhang3861218
 * 　　* @date 2020/11/15 17:44
 *      一开始没看清例子，做成了求最长连续上升子序列
 */
public class LengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        if (n==0){ return 0;}
        int[] dp=new int[n];
        dp[0]=1;
        int maxLength=1;
        for (int i=1;i<n;i++){
            dp[i]=1;
            for (int j=0;j<i;j++){
                if (nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            maxLength=Math.max(maxLength,dp[i]);
        }
        return maxLength;
    }
}
