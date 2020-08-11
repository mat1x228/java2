import java.util.UUID;

public interface TransactionsList {
    void add(Transaction transaction);
    void deleteById(UUID uuid);
    Transaction[] toArray();
}
