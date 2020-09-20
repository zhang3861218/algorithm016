package week02.homework;

import java.util.HashMap;

/**
 * 　　* @description: TODO
 * 　　* @throws
 * 　　* @author zhang3861218
 * 　　* @date 2020/9/19 17:58
 *
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> sumMap=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int value=target-nums[i];
            if (sumMap.containsKey(value)){
                return new int[]{sumMap.get(value),i};
            }else{
                sumMap.put(nums[i],i);
            }
        }
        return null;
    }
}
