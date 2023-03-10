import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public List<Animal> getAnimals() {
        return animals;
    }

    private List<Animal> animals = new ArrayList<>();

    public Zoo addAnimal(Animal animal) {
        animals.add(animal);
        return this;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + animals +
                '}';
    }

    public String talk() {
        StringBuilder sb = new StringBuilder();
        for (Speakable item : getSpeakable()) {
            sb.append(item.speak() + "\n");
        }
        return sb.toString();
    }

    private List<Speakable> getSpeakable() {
        List<Speakable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Speakable)
                result.add((Speakable) item);
        }
        result.add(new Radio());
        return result;
    }

    public List<Runnable> getRunnable() {
        List<Runnable> result = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Runnable)
                result.add((Runnable) item);
        }
        return result;
    }

    public int getChampionSpeed() {
        int max = 0;
        for (Runnable item : getRunnable()) {
            if (item.runSpeed() > max) {
                max = item.runSpeed();
            }
        }
        return max;
    }

    public List<Flyable> getFlyable() {
        List<Flyable> flyables = new ArrayList<>();
        for (Animal item : animals) {
            if (item instanceof Flyable)
            flyables.add((Flyable) item);
        }
        return flyables;
    }

    public List<Swimmable> getSwimmable(){
        List<Swimmable> swimmables = new ArrayList<>();
        for (Animal item: animals) {
            if (item instanceof Swimmable)
                swimmables.add((Swimmable) item);
        }
        return swimmables;
    }
}

