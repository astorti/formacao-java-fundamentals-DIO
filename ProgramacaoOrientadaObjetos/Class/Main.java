package ProgramacaoOrientadaObjetos.Class;

public class Main {

    public static void main(String[] args) {

        Person john = new Person("John");
        john.setYear(1975);
        john.updateAge();

        Person mary = new Person("Mary");
        mary.setYear(1982);
        mary.updateAge();

        System.out.printf("Nome: %s, idade: %s \n", john.getName(), john.getAge());
        System.out.printf("Nome: %s, idade: %s \n", mary.getName(), mary.getAge());
    }
}
