package week01.homework;

import week01.day3.SwapPairs;

/**
 * 　　* @description: TODO
 * 　　* @throws
 * 　　* @author zhang3861218
 * 　　* @date 2020/9/13 16:28
 *
 */
public class MergeTwoLists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


    /**
     * 解法一：递归解法
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null) {
            return l2;
        }
        if (l2==null){
            return l1;
        }
        if (l1.val<=l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }


    }

    /**
     * 解法二：非递归解法
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode pre=dummy;
        while (l1!=null && l2!=null){
            if(l1.val<=l2.val){
                pre.next=l1;
                l1=l1.next;
            }else{
                pre.next=l2;
                l2=l2.next;
            }
            pre=pre.next;
        }
        if (l1==null){
            pre.next=l2;
        }
        if (l2==null){
            pre.next=l1;
        }
        return dummy.next;

    }
}
