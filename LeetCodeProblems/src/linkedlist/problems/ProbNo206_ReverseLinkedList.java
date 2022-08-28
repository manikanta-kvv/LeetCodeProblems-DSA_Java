package linkedlist.problems;

public class ProbNo206_ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		ListNode newHead = null;
        ListNode temp = head;
        while(head.next != null) {
        	ListNode next = head.next;
        	head.next = newHead;
        	newHead = head;
        	head = next;
        		
        }
        return newHead;
    }
	
	private class ListNode {
		private int value;
		private ListNode next;
		
		public ListNode(int value) {
			this.value = value;
		}
		public ListNode(int value, ListNode next) {
			this.value = value;
			this.next = next;
		}
		
		
	}
}
