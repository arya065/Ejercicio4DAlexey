package daw.alexey;

public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }

    public void call(Animal pet) {
        pet.setStatus("awaken");
    }

    public void giveEat(Animal pet, double plus) {
        pet.eat(plus);
    }

    public void playWithPet(Animal pet, int min) {
        try {
            pet.play(min);
        } catch (IllegalArgumentException e) {
            System.out.println("No puede ser mas de 180 min");
            pet.play(180);
        }
    }
}
