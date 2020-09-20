package week02.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * 　　* @description: TODO
 * 　　* @throws
 * 　　* @author zhang3861218
 * 　　* @date 2020/9/20 14:58
 *      N叉树的层序遍历
 */
public class LevelOrder {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root){
        if(root==null){
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        bfs(1,list,root);
        return list;
    }

    void bfs(int index,List<List<Integer>> list,TreeNode root){
        if(list.size()<index){
            list.add(new ArrayList<Integer>());
        }
        list.get(index-1).add(root.val);
        if(root.left!=null){
            bfs(index+1,list,root.left);
        }
        if(root.right!=null){
            bfs(index+1,list,root.right);
        }

    }




}
