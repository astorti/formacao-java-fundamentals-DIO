package ProgramacaoOrientadaObjetos.Record;

public record Person(String name, int age) {

    public String getInfo() {
        return "Name: " + name + ", Age: " + age; 
    }
}
