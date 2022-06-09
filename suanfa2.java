package cn.jyt;
//给你两个非空 的链表，表示两个非负的整数。它们每位数字都是按照逆序的方式存储的，并且每个节点只能存储一位数字。
//        请你将两个数相加，并以相同形式返回一个表示和的链表。
//        你可以假设除了数字 0 之外，这两个数都不会以 0开头。

//输入：l1 = [2,4,3], l2 = [5,6,4]
//输出：[7,0,8]
//解释：342 + 465 = 807.
public class suanfa2 {
    public static void main(String[] args) {
        ListNode a=new ListNode(3);
        ListNode b=new ListNode(4,a);
        ListNode l1=new ListNode(2,b);


        ListNode A=new ListNode(4);
        ListNode B=new ListNode(6,A);
        ListNode l2=new ListNode(5,B);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(addTwoNumbers(l1,l2));
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int keyAdd = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1.val ;
            int n2 = l2.val;
            int sum = n1 + n2 + keyAdd;
            keyAdd = sum / 10;//比如此次是个位数相加，/10得到的值将与十位数相加
            if (head == null) {
                head = tail = new ListNode(sum % 10);//第一次循环，两个地址值相等
            } else {
                tail.next = new ListNode(sum % 10);//第二次循环设置tail相当于设置head的next节点
                tail = tail.next;//之后每次将tail变成next节点指向的对象
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (keyAdd > 0) {
            tail.next = new ListNode(keyAdd);
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}