public class Wild extends Animal {
    public Wild(int age, LifeStatus lifeStatus, int hungerLevel, int emotionLevel) {
        super(age, lifeStatus, hungerLevel, emotionLevel);
    }

    public Wild(int age) {
        this(age, LifeStatus.ALIVE, 5, 2);
    }

}
