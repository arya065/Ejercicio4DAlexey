package daw.alexey;

import java.util.*;
import java.time.*;

public class Animal {

    Scanner in = new Scanner(System.in);
    private LocalDate birth;
    private String name;
    private String type;
    private double mass;
    private String status;

    public Animal() {
    }

    public Animal(LocalDate birth, String name, String type, double mass, String status) {
        this.birth = birth;
        this.name = name;
        this.type = type;
        this.mass = mass;
        this.status = status;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Animal{" + "birth=" + birth + ", name=" + name + ", type=" + type + ", mass=" + mass + ", status=" + status + '}';
    }

    
    
    
    
    
    
    
    
    
    public void eat(double plus) {
        double mass = getMass();
        setStatus("eating");
        setMass (mass + Math.abs(plus));
    }

    public void sleep() {
        setStatus("sleeping");
    }

    public void awake() {
        setStatus("awaken");
    }

    public void relax() {
        setStatus("calm");
    }

    public void play(int min) {
        setStatus("playing");
        if (min>=180){
            min=180;
        }
        int cycle=Math.floorDiv(min, 30);
        setMass(mass - (cycle * 20));
        if((min-cycle*30)%1!=0){
            setMass(mass+10);
        }
    }
    public Animal clone(Animal pet){
        
        LocalDate birthClone = pet.getBirth();
        String nameClone = pet.getName();
        String typeClone = pet.getType();
        double massClone =  pet.getMass();
        String statusClone = pet.getStatus();
        
        Animal petClone= new Animal(birthClone, nameClone, typeClone, massClone, statusClone);
        return petClone;
    }

}
