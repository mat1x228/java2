import java.util.UUID;

public class Main {

    public static void main(String[] args) throws UserNotFoundException {
        User sender = new User("Peter", 100500);
        User recipient = new User("Alex", -100500);
        UsersArrayList usersArrayList = new UsersArrayList();
        usersArrayList.add(sender);
        usersArrayList.add(recipient);
        for (int i = 0; i < usersArrayList.count(); i++) {
            System.out.println(usersArrayList.getByIndex(i));
        }
        Transaction transaction = new Transaction(sender,recipient, "incoming", 10,UUID.randomUUID());
        System.out.println(transaction);
    }
}
