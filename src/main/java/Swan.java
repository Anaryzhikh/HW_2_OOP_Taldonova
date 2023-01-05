public class Swan extends Animal implements Flyable, Swimmable{
    public Swan(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public int flySpeed() {
        return 15;
    }

    @Override
    public int swimSpeed() {
        return 10;
    }

    @Override
    public String toString() {
        return "Swan" + super.toString();
    }
}
