public class MiddleOfLinkedList {
    private static int solve(LLNode node) {
        LLNode fastptr,slowptr;
            slowptr = node;
            fastptr = node;
        while(fastptr!=null && fastptr.next!=null){
            
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            
        }
        return slowptr.val;
    }

    class LLNode {
           int val;
           LLNode next;
         }
}
