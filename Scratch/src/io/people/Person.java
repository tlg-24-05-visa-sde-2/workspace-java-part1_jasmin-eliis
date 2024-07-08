package io.people;

import java.time.LocalDate;


class Person {
    private final  String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int age (){
        return 0;
    }

    public String name (){
        return name;
    }

    public LocalDate birthDate (){
        return birthDate;
    }

    public String toString(){
        return String.format("Person: name=%s, birthdate=%s", name(), birthDate());
    }

}