public class Dog extends Animal{

    private static int dogs;

    public Dog(String name){
        dogs++;
        super.name = name;
        System.out.println("Создана собака с именем " + name);
    }

    public void toSwim(int distance){
        if (distance <= 10) {
            super.toSwim(distance);
        } else {
            System.out.printf("%s проплыл 10 метров и вышел на берег, проплыть %s метров не получилось\n", name, distance);
        }
    }

    public void runAway(int distance){
        if (distance <= 500) {
            super.runAway(distance);
        } else {
            System.out.printf("%s пробежал 500 метров и устал, дистанцию в %s метров преодолеть не смог\n", name, distance);
        }
    }

    public static int getDogs() {
        return dogs;
    }
}
