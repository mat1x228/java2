import java.util.UUID;

public class Transaction {
    private UUID id;
    private User sender;
    private User recipient;
    private String category;
    private int sum;
    public Transaction previos;
    public Transaction next;

    public Transaction(User sender, User recipient, String category, int sum, UUID id) {
        this.category = category;
        this.id = id;
        this.recipient = recipient;
        this.sender = sender;
        this.sum = sum;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getRecipient() {
        return recipient;
    }

    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        if(this.category.equals("incoming")&&sum>=0|| this.category.equals("outgoing")&&sum<0)
            this.sum = sum;
        else
            throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        return this.category+": "+this.sender.getName()+"->"+this.recipient.getName()+" "+this.sum;
    }
}
