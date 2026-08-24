// Last updated: 8/24/2026, 11:37:58 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeElements(ListNode head, int val) {
13        ListNode d=new ListNode(0);
14        d.next=head;
15        ListNode c=d;
16        while(c.next!=null){
17            if(c.next.val==val){
18                c.next=c.next.next;
19            }else{
20                c=c.next;
21            }
22        }
23        return d.next;
24    }
25}