import java.util.Arrays;

public class UsersArrayList implements UsersList
{
    private User[] array=new User[10];
    private int count=0;


    public void add(User user) {
        if(count>=array.length){
            User[] t = new User[(int)Math.round(array.length*1.5)];
            System.arraycopy(array,0,t,0,array.length);
            array = t;
        }
        array[count++]=user;
    }

    public User getById(int id) throws UserNotFoundException {
        return Arrays.stream(array).filter(x->x.getId()==id).findAny().get();
    }

    public User getByIndex(int index) throws UserNotFoundException {
        if(index>=count||index<0)
            throw new UserNotFoundException(Integer.toString(index));
        else
            return array[index];
    }

    public int count() {
        return count;
    }
}
