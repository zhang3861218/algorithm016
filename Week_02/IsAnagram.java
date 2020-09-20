package week02.homework;

/**
 * 　　* @description: TODO
 * 　　* @throws
 * 　　* @author zhang3861218
 * 　　* @date 2020/9/19 16:41
 *
 */
public class IsAnagram {
    public boolean isAnagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        int[] c=new int[26];
        for (int i=0;i<s.length();i++){
            c[s.charAt(i)-'a']++;
            c[t.charAt(i)-'a']--;
        }
        for (int i=0;i<c.length;i++){
            if(c[i]!=0){
                return false;
            }
        }
        return true;
    }
}
