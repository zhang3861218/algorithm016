package week02.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * 　　* @description: TODO
 * 　　* @throws
 * 　　* @author zhang3861218
 * 　　* @date 2020/9/19 21:45
 *      中序遍历二叉树
 */
public class InorderTraversal {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        mid(res,root);
        return res;
    }

    void mid(List<Integer> list, TreeNode root){
        if (root==null){
            return;
        }
        mid(list,root.left);
        list.add(root.val);
        mid(list,root.right);

    }



}
