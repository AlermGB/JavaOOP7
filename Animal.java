public abstract class Animal extends Creation {
    protected final int maxHungerLevel = 7;
    protected final int maxEmotionlevel = 3;
    protected AnimalSize animalSize;
    protected LifeStatus lifeStatus;
    protected int hungerLevel;
    protected int emotionLevel;

    public Animal(int age, LifeStatus lifeStatus, int hungerLevel, int emotionLevel) {
        super(age);
        this.lifeStatus = LifeStatus.ALIVE;
        this.hungerLevel = hungerLevel;
        this.emotionLevel = emotionLevel;
    }

    public Animal(int age) {
        this(age, LifeStatus.ALIVE, 5, 2);
    }

    public int getMaxHungerLevel() {
        return maxHungerLevel;
    }

    public int getMaximumEmotionlevel() {
        return maxEmotionlevel;
    }

    public LifeStatus getLifeStatus() {
        return lifeStatus;
    }

    public void setLifeStatus(LifeStatus lifeStatus) {
        this.lifeStatus = lifeStatus;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getEmotionLevel() {
        return emotionLevel;
    }

    public void setEmotionLevel(int emotionLevel) {
        this.emotionLevel = emotionLevel;
    }

    public void die() {
        lifeStatus = LifeStatus.DEAD;
        emotionLevel = 0;
        hungerLevel = 0;
    }

    public void oneStepAction() {
        hungerLevel -= 1;
        if (hungerLevel < 1) {
            this.die();
        }
        if (hungerLevel < 2) {
            emotionLevel = 0;
        }
    }

    public void haveFun() {
        this.oneStepAction();
        if (emotionLevel < maxEmotionlevel) {
            emotionLevel += 1;
        }
    }

    public void eat() {
        hungerLevel = maxHungerLevel;
    }

}
