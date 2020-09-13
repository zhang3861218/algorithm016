package week01.homework;

/**
 * 　　* @description: TODO
 * 　　* @throws
 * 　　* @author zhang3861218
 * 　　* @date 2020/9/13 20:55
 *
 */
public class RotateArray {
    /**
     *  AB=(A^B^)^
     *
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
