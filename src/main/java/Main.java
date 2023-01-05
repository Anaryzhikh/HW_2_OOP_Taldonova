public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Barsik", 4, "Oleg"))
                .addAnimal(new Dog("Sharik", 4, "Lena"))
                .addAnimal(new Duck("Tosya", 2, "Dima"))
                .addAnimal(new Eagle("Alkhan", 2, "Timurlan"))
                .addAnimal((new Swan("Princess", 2, "Chaikovsky")));
        System.out.println(zoo.toString());
        System.out.println(zoo.talk());
        System.out.println("-------");
        System.out.println("Бегуны");
        for (Runnable i: zoo.getRunnable()) {
            System.out.println(i.runSpeed());}
        System.out.println(zoo.getChampionSpeed());
        System.out.println("-------");
        System.out.println("Летуны");
        for (Flyable item: zoo.getFlyable()) {
            System.out.println(item.flySpeed());}
        System.out.println("-------");

        SaveManager saveManager = new SaveManager();
        saveManager.save(zoo.getAnimals());
        System.out.println("Плавуны");
        for (Swimmable item: zoo.getSwimmable()) {
            System.out.println(item.swimSpeed());
        }


}
}

