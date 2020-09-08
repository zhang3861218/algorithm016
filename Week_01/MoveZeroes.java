package week01;

/**
 * 　　* @description: TODO
 * 　　* @throws
 * 　　* @author zhang3861218
 * 　　* @date 2020/9/8 22:24
 *
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int j=0;//记录第一个0前一个数的下标
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=0) {
                nums[j] = nums[i];
                if (i != j) {//当i!=j时，nums[i]和nums[j]完成交换
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
}
