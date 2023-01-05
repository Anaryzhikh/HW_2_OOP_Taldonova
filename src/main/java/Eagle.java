public class Eagle extends Animal implements Runnable, Speakable, Flyable {
    public Eagle(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public int flySpeed() {
        return 50;
    }

    @Override
    public Integer runSpeed() {
        return 2;
    }

    @Override
    public String speak() {
        return "Ow";
    }

    @Override
    public String toString() {
        return "Eagle" + super.toString();
    }
}
