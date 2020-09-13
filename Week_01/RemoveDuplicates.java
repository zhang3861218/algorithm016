package week01.homework;

/**
 * 　　* @description: TODO
 * 　　* @throws
 * 　　* @author zhang3861218
 * 　　* @date 2020/9/8 21:54
 *
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        int p=0,q=1;
        while (q<nums.length){
            if(nums[p]!=nums[q]){
                nums[p+1]=nums[q];
                p++;
            }
            q++;
        }
        return p+1;
    }
}
