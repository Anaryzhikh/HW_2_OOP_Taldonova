public class Cat extends Animal implements Speakable, Runnable {
    public Cat(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public String speak() {
        return "Meow";
    }

    @Override
    public Integer runSpeed() {
        return 20;
    }

    @Override
    public String toString() {
        return "Cat" + super.toString();
    }
}
