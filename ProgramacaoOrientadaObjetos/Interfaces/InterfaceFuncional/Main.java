package ProgramacaoOrientadaObjetos.Interfaces.InterfaceFuncional;

import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        List<User> users = List.of(
            new User("Maria", 30),
            new User("João", 32),
            new User("Eduardo", 40)
        );
  
        System.out.println("-----------------------------------");
        users.forEach((User user) -> {
            System.out.println(user.name() + " - " + user.age());
        });
        
        System.out.println("-----------------------------------");
        users.forEach((User user) -> System.out.println(user));
        
        System.out.println("-----------------------------------");
        users.forEach(System.out::println);
        
        System.out.println("-----------------------------------");
        printStringValue(Record::toString, users);
    }
    
    private static void printStringValue(Function<User, String> callback, List<User> users){
        System.out.println("Função printStringValue");
        users.forEach(u -> System.out.println(callback.apply(u)));
    }
}
