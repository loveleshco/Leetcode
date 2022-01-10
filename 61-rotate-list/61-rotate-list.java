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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null)
        {
            return null;
        }
        
        if(head.next == null)
        {
            return head;
        }
        
        int len = leng(head);
        
        k = k%len;
        
        for(int i = 0; i < k; i++)
        {
            ListNode temp = head;
            int e = endElement(head);
            ListNode end = new ListNode(e);
            
            end.next = temp;
            temp.next = head.next;
            head = end;
        }
        
        return head;
        
    }
    
    public int endElement(ListNode head)
    {
        ListNode t = head;
        ListNode t2 = head;
        
        t = t.next;
        
        while(t.next != null && t2.next != null)
        {
            t = t.next;
            t2 = t2.next;
        }
        
        int res = t.val;
        
        t2.next = null;
        t = null;
        
        return res;
    }
    
    public int leng(ListNode h)
    {
        int c = 0;
        
        while(h != null)
        {
            c++;
            h = h.next;
        }
        return c;
    }
}