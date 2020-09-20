package week02.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * 　　* @description: TODO
 * 　　* @throws
 * 　　* @author zhang3861218
 * 　　* @date 2020/9/19 22:39
 *      N叉树前序遍历
 */
public class Preorder {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };


    public List<Integer> preorder(Node root) {
        List<Integer> list=new ArrayList<>();
        order(list,root);
        return list;
    }


    public void order(List<Integer> list,Node node){
        if (node==null){
            return ;
        }
        list.add(node.val);
        for (Node child:node.children
             ) {
            order(list,child);
        }

    }


}
