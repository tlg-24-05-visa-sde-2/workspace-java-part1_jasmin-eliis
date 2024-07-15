package net.human;

import java.time.LocalDate;
import java.time.Period;

class Person {
    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        super();
        this.name = name;
        this.birthDate = birthDate;
    }

    public int age(){
        return Period.between(birthDate(),LocalDate.now()).getYears();
    }

    public String name(){
        return name;
    }
    public LocalDate birthDate(){
        return birthDate;
    }

    @Override
    public String toString() {
        return String.format("%s: name=%s, birthDate=%s", getClass().getSimpleName(), name(), birthDate());
    }
}