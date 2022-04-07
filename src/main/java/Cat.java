public class Cat extends Animal{

    private static int cats;

    public Cat(String name){
        cats++;
        super.name = name;
        System.out.println("Создан котик с именем " + name);
    }

    public void toSwim(int distance){
        System.out.printf("%s не умеет плавать\n", name);
    }

    public void runAway(int distance){
    if (distance <= 200) {
        super.runAway(distance);
    } else {
        System.out.printf("%s пробежал 200 метров и устал, дистанцию в %s метров преодолеть не смог\n", name, distance);
    }
    }

    public static int getCats() {
        return cats;
    }
}

