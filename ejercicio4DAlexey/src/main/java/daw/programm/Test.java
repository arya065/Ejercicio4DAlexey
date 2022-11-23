package daw.programm;

import daw.alexey.Animal;
import daw.alexey.Person;
import java.time.LocalDate;
import java.time.Month;

public class Test {

    public static void main(String[] args) {

        Animal petA = new Animal(LocalDate.of(2000, Month.MARCH, 1), "pet1", "cat", 100, "sleeping");
        Animal petB = new Animal(LocalDate.of(2000, Month.MARCH, 2), "pet2", "dog", 1000, "playing");
        Person persA = new Person("dave", 10);
        Person persB = new Person("John", 20);

        System.out.println(petA.toString());
        System.out.println(petB.toString());
        Animal petC = petB.clone(petB);
        System.out.println(petC.toString());

        persA.call(petA);
        persA.call(petB);
        persA.call(petC);
        
        persB.playWithPet(petB, 120);
        persA.giveEat(petA, 1000);
        System.out.println(petA.getMass());
        persA.playWithPet(petA, 200);
        System.out.println(petA.getMass());
    }
}
