package week06.homework;

/**
 * 　　* @description: TODO
 * 　　* @throws
 * 　　* @author zhang3861218
 * 　　* @date 2020/10/25 23:30
 *
 */
public class CountSubstrings {
    public int countSubstrings(String s) {
        int n=s.length();
        boolean[][] dp=new boolean[n][n];
        int res=0;
        for (int i=0;i<n;i++){
            dp[i][i]=true;
            res++;
        }
        for (int i=0;i<n-1;i++){
            if (s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=true;
                res++;
            }
        }
        for (int len=3;len<=n;len++){
            for (int i=0;i+len<=n;i++){
                int j=i+len-1;
                if (s.charAt(i)==s.charAt(j)){
                    dp[i][j]=dp[i+1][j-1];//看I和J之间的子串是不是回文子串
                    if (dp[i][j]){
                        res++;
                    }
                }
            }
        }
        return res;
    }
}
