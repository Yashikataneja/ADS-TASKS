class LN{
    int val;
    LN next;
    LN(int x){
        val=x;
        next=null;
    }
}

public class linkedlistproblem1 {
    //detect if a cycle is present in the linkedlist , if present remove it.
    // Approach: floryds cycle algorithm
    // use two pointers slow and fast , slow moves one step and fast moves two steps
    // if they meet a cycle exists

    // to remove the cycle:
    // start the pointer form the head 
    // move the pointers at the same speed until they meet
    //find the last node and remove the cycle

    public static boolean hascycle(LN head){
        LN slow = head , fast = head;
        while(fast != null && fast.next!=null ){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true; // cycle detected

        }
        return false;
    }

    private static void remCycle(LN head){
        LN slow = head , fast = head;
        boolean cycleExi = false;
        while(fast != null && fast.next!=null ){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycleExi = true;
                break;
            }
        }
        if(!cycleExi) return;
        slow = head;
        while(slow.next != fast.next){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;

    }

    public static void main(String[] args) {
        LN head = new LN(1);
        head.next = new LN(2);
        head.next.next = new LN(3);
        head.next.next.next = new LN(4);
        head.next.next.next.next = new LN(5);
        head.next.next.next.next.next = head.next.next;
        System.out.println(hascycle(head));
        remCycle(head);
        System.out.println(hascycle(head));
    }
    
}