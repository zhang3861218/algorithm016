package week02.homework;

import java.util.*;

/**
 * 　　* @description: TODO
 * 　　* @throws
 * 　　* @author zhang3861218
 * 　　* @date 2020/9/19 17:02
 *
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs){
        Map<String,List<String>> group=new HashMap<>();
        for (int i=0;i<strs.length;i++){
            char[] childStr=strs[i].toCharArray();
            Arrays.sort(childStr);
            String key=String.valueOf(childStr);
            if (group.containsKey(key)){
                group.get(key).add(strs[i]);
            } else{
                List<String> temp=new ArrayList<>();
                temp.add(strs[i]);
                group.put(key,temp);
            }
        }

        return new ArrayList<List<String>>(group.values());

    }
}
