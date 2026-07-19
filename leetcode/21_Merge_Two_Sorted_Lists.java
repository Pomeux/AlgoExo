/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null) return null;

        ListNode racine=new ListNode();  
        ListNode list=new ListNode();
        racine.next=list;  
        while(list1!=null || list2!=null) {
            if(list1!=null && list2!=null) {
                if(list1.val<=list2.val) {
                    list.val=list1.val;
                    list1=list1.next;
                } else {
                    list.val=list2.val;

                    list2=list2.next;
                }
            } else if(list1==null){
                list.val=list2.val;
                list2=list2.next;
            
            } else if(list2==null) {
                list.val=list1.val;
                list1=list1.next;
            }
            if(list1==null && list2==null) return racine.next;
            list.next=new ListNode();
            list=list.next;


        } 
        return racine.next;
    }

}
