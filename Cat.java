
import java.util.Iterator;

public class Cat extends Pet implements Predators {
    private final String catSound = "Мяу!";
    private final AnimalSize animalSize = AnimalSize.MEDIUM;

    public Cat(int age, String name, Position position, Human master) {
        super(age, name, position, master);
    }

    public Cat(int age, String name, Human master) {
        this(age, name, Position.NOTHERE, master);
    }

    public AnimalSize getAnimalSize() {
        return animalSize;
    }

    @Override
    public void hunt(Animal target) {
        oneStepAction();
        if (target.animalSize == AnimalSize.SMALL) {
            target.die();
            eat();
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", lifeStatus=" + lifeStatus +
                ", hungerLevel=" + hungerLevel +
                ", emotionLevel=" + emotionLevel +
                '}';
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    public void toSay() {
        System.out.println(catSound);
    }
}
