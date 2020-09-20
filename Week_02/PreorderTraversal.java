package week02.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * 　　* @description: TODO
 * 　　* @throws
 * 　　* @author zhang3861218
 * 　　* @date 2020/9/19 21:53
 *      前序遍历二叉树
 */
public class PreorderTraversal {
    public class TreeNode {
        int val;
        InorderTraversal.TreeNode left;
        InorderTraversal.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, InorderTraversal.TreeNode left, InorderTraversal.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public List<Integer> inorderTraversal(InorderTraversal.TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        pre(res,root);
        return res;
    }

    void pre(List<Integer> list, InorderTraversal.TreeNode root){
        if (root==null){
            return;
        }
        list.add(root.val);
        pre(list,root.left);
        pre(list,root.right);

    }


}
