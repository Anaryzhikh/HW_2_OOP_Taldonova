public class Dog extends Animal implements Speakable, Runnable, Swimmable {

    public Dog(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public String speak() {
        return "Wow";
    }

    @Override
    public Integer runSpeed() {
        return 30;
    }

    @Override
    public String toString() {
        return "Dog" + super.toString();
    }

    @Override
    public int swimSpeed() {
        return 6;
    }
}
