import static java.lang.System.out;

public abstract class Pet extends Animal implements Iterable {
    protected String name;
    protected Position position;
    protected Human master;

    public Pet(int age, String name, Position position, Human master) {
        super(age);
        this.name = name;
        this.position = position;
        this.master = master;
    }

    public Pet(int age, String name, Human master) {
        this(age, name, Position.NOTHERE, master);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Human getMaster() {
        return master;
    }

    public void setMaster(Human master) {
        this.master = master;
    }

    public void haveFunWithHuman(Human human) {
        this.haveFun();
    }

    public void beCalled(Human human) {
        if (position == Position.NOTHERE) {
            oneStepAction();
            position = Position.HERE;
            if (emotionLevel < maxEmotionlevel) {
                emotionLevel += 1;
            }
        }
    }

    public void beDrivedAway(Human human) {
        position = Position.NOTHERE;
        oneStepAction();
        thinkAboutBadHuman(human);
        if (emotionLevel != 0) {
            emotionLevel -= 1;
        }
    }

    public void thinkAboutBadHuman(Human human) {
        out.println(name + " думает, что " + human.getName() + " - подлый кожаный мешок");
    }
}
