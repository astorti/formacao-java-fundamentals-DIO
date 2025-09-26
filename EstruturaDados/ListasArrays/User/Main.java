package EstruturaDados.ListasArrays.User;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        User user = new User(1, "John");
        users.add(user);

        users.add(new User(2, "Mary"));
        users.add(new User(3, "Peter"));
        users.add(new User(5, "Ana"));

        System.out.println(users.contains(user));
        System.out.println(users.contains(new User(1, "John")));
        System.out.println(new User(4, "João").equals(new User(4, "João")));
        
        System.out.println(users.isEmpty());
        System.out.println(users.getFirst());
        System.out.println(users.getLast());

        System.out.println(users);
        System.out.println(users.removeLast());
        System.out.println(users);
        System.out.println(users.remove(1));
        System.out.println(users);
        users.clear();
        System.out.println(users);
    }
    
}
