package EstruturaDados.Set.TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        
        Set<User> users = new TreeSet<>(Comparator.comparingInt(User::getId));
        users.add(new User(1, "André"));
        users.add(new User(2, "João"));
        users.add(new User(3, "Maria"));
        users.add(new User(4, "Ana"));
        users.add(new User(4, "Ana"));

        System.out.println(users);
    }
}
