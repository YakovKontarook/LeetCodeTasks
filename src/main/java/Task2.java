import java.util.LinkedList;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

        You may assume the two numbers do not contain any leading zero, except the number 0 itself.

        Input: l1 = [2,4,3], l2 = [5,6,4]
        Output: [7,0,8]
        Explanation: 342 + 465 = 807.

*/
public class Task2 {

    public static void main(String[] args) {

    }


    public static class ListNode {
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
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        int carry = 0;
        ListNode ret = ans;
        while(l1 != null && l2 != null)
        {
            ListNode temp = new ListNode();
            int sum = carry + l1.val + l2.val;
            temp.val = sum%10;
            carry = sum/10;
            temp.next = null;

            l1 = l1.next;
            l2 = l2.next;

            if(ans == null)
                ans = temp;
            else{
                ans.next = temp;
                ans = ans.next;
            }
        }

        while(l1 != null){
            ListNode temp = new ListNode();
            temp.val = (l1.val+carry)%10;
            carry = (l1.val+carry)/10;
            temp.next = null;
            ans.next = temp;
            ans = ans.next;
            l1 = l1.next;
        }

        while(l2 != null){
            ListNode temp = new ListNode();
            temp.val = (l2.val+carry)%10;
            carry = (l2.val+carry)/10;
            temp.next = null;
            ans.next = temp;
            ans = ans.next;
            l2 = l2.next;
        }

        if(carry != 0){
            ListNode temp = new ListNode();
            temp.val = carry;
            temp.next = null;
            ans.next = temp;
            ans = ans.next;
        }

        return ret.next;
    }
}


