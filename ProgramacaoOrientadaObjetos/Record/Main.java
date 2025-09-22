package ProgramacaoOrientadaObjetos.Record;

public class Main {

    public static void main(String[] args) {

        Person john = new Person("John", 45);
        System.out.printf("Nome: %s, idade: %s \n", john.name(), john.age());
        System.out.println(john.getInfo());
    }
}
