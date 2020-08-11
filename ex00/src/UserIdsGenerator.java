public class UserIdsGenerator {
    private static UserIdsGenerator instance;
    private UserIdsGenerator () {}
    private int counter=0;
    public static UserIdsGenerator getInstance() {
        if (instance == null) {
            instance = new UserIdsGenerator();
        }
        return instance;
    }
    public int generateId() {
        return this.counter++;
    }
}
