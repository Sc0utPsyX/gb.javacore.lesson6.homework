public abstract class Animal {

    protected String name;
    private static int animals;

    public Animal() {
        animals++;
    }

    public void toSwim(int distance){
        System.out.printf("%s проплыл %s метров\n", name, distance);
    }

    public void runAway(int distance){
        System.out.printf("%s пробежал %s метров\n", name, distance);
    }

    public String getName() {
        return name;
    }

    public static int getAnimals() {
        return animals;
    }
}
