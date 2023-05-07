public class Mouse extends Wild implements Herbivores {
    private final String catSound = "Пи-пи!!";
    private final AnimalSize animalSize = AnimalSize.SMALL;

    public Mouse(int age, LifeStatus lifeStatus, int hungerLevel, int emotionLevel) {
        super(age, lifeStatus, hungerLevel, emotionLevel);
    }

    public Mouse(int age) {
        super(age);
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "lifeStatus=" + lifeStatus +
                ", hungerLevel=" + hungerLevel +
                ", emotionLevel=" + emotionLevel +
                ", age=" + age +
                '}';
    }

    public AnimalSize getAnimalSize() {
        return animalSize;
    }
}
