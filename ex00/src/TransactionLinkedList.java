import java.util.ArrayList;
import java.util.UUID;

public class TransactionLinkedList implements TransactionsList {
    private Transaction first;
    private Transaction last;

    public void add(Transaction transaction) {
        if(first==null) {
            first = transaction;
            last = transaction;
        }
        else
        {
            transaction.previos = last;
            last.next = transaction;
            last = transaction;
        }
    }

    public void deleteById(UUID uuid) {
        Transaction current = first;
        while (current!=null){
            if(current.getId()==uuid) {
                if(current.previos==null){ // first
                    if (current.next!=null) { // not last
                        current.next.previos = null;
                    }
                } else { // not first
                    if(current.next==null) // last
                    {
                        current.previos.next=null;
                    } else { // in center
                        current.previos.next=current.next;
                        current.next = current.previos;
                    }
                }
            }
            current = current.next;
        }
    }

    public Transaction[] toArray() {
        ArrayList<Transaction> result = new ArrayList<>();
        Transaction current = first;
        while ((current!=null)) {
            result.add(current);
            current = current.next;
        }
        return (Transaction[]) result.toArray();
    }
}
