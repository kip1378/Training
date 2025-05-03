package LeetCode;

public class ListNode {
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


    public static void main(String[] args) {
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(10);
        ListNode node3 = new ListNode(15);

        node1.next = node2;
        node2.next = node3;
        ListNode current = node1;
        while (current != null ) {
            System.out.println(current.val);
            current = current.next;
        }
    }
}
