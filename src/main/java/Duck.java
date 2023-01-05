public class Duck extends Animal implements Flyable, Runnable, Speakable,Swimmable{

    public Duck(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public int flySpeed() {
        return 10;
    }

    @Override
    public Integer runSpeed() {
        return 5;
    }

    @Override
    public String speak() {
        return "Krya";
    }

    @Override
    public String toString() {
        return "Duck" + super.toString();
    }

    @Override
    public int swimSpeed() {
        return 8;
    }
}
