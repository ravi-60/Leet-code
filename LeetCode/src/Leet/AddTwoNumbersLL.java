package Leet;

class ListNode {
    int val; // The value of the node
    ListNode next; // Pointer to the next node

    ListNode(int x) {
        val = x;
        next = null; // Initialize next as null
    }
}

public class AddTwoNumbersLL {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode R = new ListNode(0); // Dummy node to start the result list
        ListNode l3 = R; // Pointer to build the result list
        int carry = 0; // Initialize carry to 0

        // Loop until both lists are processed
        while (l1 != null || l2 != null) {
            int l1_val = (l1 != null) ? l1.val : 0; // Get l1 value or 0
            int l2_val = (l2 != null) ? l2.val : 0; // Get l2 value or 0
            int current_sum = l1_val + l2_val + carry; // Calculate sum with carry

            carry = current_sum / 10; // Update carry for next iteration
            int last_digit = current_sum % 10; // Get last digit for the current node

            ListNode node1 = new ListNode(last_digit); // Create new node with last digit
            l3.next = node1; // Link new node to the result list
            l3 = l3.next; // Move l3 to the newly added node

            // Move to the next nodes in l1 and l2
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // If there's a carry left, add a new node
        if (carry > 0) {
            ListNode node2 = new ListNode(carry);
            l3.next = node2; // Link carry node to the result list
        }

        return R.next; // Return the head of the result list (skipping dummy node)
    }

    // Helper method to print the linked list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Main method to run the example
    public static void main(String[] args) {
        AddTwoNumbersLL solution = new AddTwoNumbersLL();

        // Creating l1: 2 -> 4 -> 3 (represents the number 342)
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Creating l2: 5 -> 6 -> 4 (represents the number 465)
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Adding the two numbers
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Printing the result
        solution.printList(result); // Should print 7 -> 0 -> 8 (represents the number 807)
    }
}

