package EstruturaDados.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        
        Set<User> users = new HashSet<>();
        users.add(new User(1, "André"));
        users.add(new User(2, "João"));
        users.add(new User(3, "Maria"));
        users.add(new User(4, "Ana"));
        users.add(new User(4, "Ana"));

        System.out.println(new User(5, "Paulo"));
        System.out.println(new User(6, "Paula"));

        System.out.println(users.contains(new User(1, "André")));

        users.forEach(System.out::println);

        System.out.println("---------------------");
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("---------------------");
        users.removeIf(user -> user.getId() > 2);
        System.out.println(users);
    }
}
