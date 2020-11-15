package week09.homework;

/**
 * 　　* @description: TODO
 * 　　* @throws
 * 　　* @author zhang3861218
 * 　　* @date 2020/11/15 17:31
 *
 */
public class FirstUniqChar {
    public int firstUniqChar(String s) {
        int[] nums=new int[26];
        char[] chars=s.toCharArray();
        for (char ch:chars){
            nums[ch-'a']++;
        }
        for (int i=0;i<chars.length;i++){
            if (nums[chars[i]-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
