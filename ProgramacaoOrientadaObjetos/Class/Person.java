package ProgramacaoOrientadaObjetos.Class;

import java.time.OffsetDateTime;

public class Person {

    private final String name;
    private int year;
    private int age;
    private int lastYearAgeInc = OffsetDateTime.now().getYear();

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void updateAge() {
        age = lastYearAgeInc - year;
        this.lastYearAgeInc = OffsetDateTime.now().getYear();
    }
}
