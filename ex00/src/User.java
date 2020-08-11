import java.util.UUID;

public class User {
    private int id;
    private String name;
    private int balance;
    public  User(String name, int balance)
    {
        this.id=UserIdsGenerator.getInstance().generateId();
        this.balance=balance;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance<0)
            throw new IllegalArgumentException();
        this.balance=balance;
    }
}
