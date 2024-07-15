package net.human;

import java.time.LocalDate;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("Jasmin", LocalDate.of(1989, 9, 27));

        System.out.printf("%s is %s years old\n", p1.name(), p1.age());

        System.out.println(p1);
        System.out.println();

        PersonRecord p2 = new PersonRecord("Uriyah", LocalDate.of(2016, 4, 24));
        System.out.printf("%s is %s years old\n", p2.name(), p2.age());
        System.out.println(p2
        );
    }
}