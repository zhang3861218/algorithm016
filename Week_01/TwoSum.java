package week01.homework;

import java.util.HashMap;
import java.util.Map;

/**
 * 　　* @description: TODO
 * 　　* @throws
 * 　　* @author zhang3861218
 * 　　* @date 2020/9/13 17:17
 *
 */
public class TwoSum {
    /**
     * 暴力法
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum1(int[] nums, int target) {
        int[] a=null;
        for (int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    a= new int[]{i,j};
                }
            }
        }
        return a;
    }

    /**
     * 一次遍历
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> aa=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int value=target-nums[i];
            if(aa.containsKey(value)){
                return new int[]{i,aa.get(value)};
            }
            aa.put(nums[i],i);
        }
        return null;
    }

}
