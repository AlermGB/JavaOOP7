import java.util.ArrayList;

import static java.lang.System.out;

public class Human extends Creation {
    private String name;
    private ArrayList<Pet> pets = new ArrayList<>();

    public Human(int age, String name, ArrayList<Pet> pets) {
        super(age);
        this.name = name;
        this.pets = new ArrayList<>();
    }

    public Human(int age, String name) {
        this(age, name, new ArrayList<>());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "name= " + name +
                ", age= " + age;
    }

    public void callPet(Pet pet) {
        out.println(pet.getName() + "!");
        out.println(pet.getName() + "!");
        pet.beCalled(this);
    }

    public void feedPet(Pet pet) {
        if (pet.getPosition() == Position.HERE) {
            pet.eat();
        }
    }

    public void playWitPet(Pet pet) {
        pet.haveFun();
    }

    public void driveAvayPet(Pet pet) {
        pet.beDrivedAway(this);
    }
}
