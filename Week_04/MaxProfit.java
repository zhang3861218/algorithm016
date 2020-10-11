package week04.homework;

/**
 * 　　* @description: TODO
 * 　　* @throws
 * 　　* @author zhang3861218
 * 　　* @date 2020/10/11 22:52
 *
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]){
                maxprofit += prices[i] - prices[i - 1];

            }
        }
        return maxprofit;
    }
}
