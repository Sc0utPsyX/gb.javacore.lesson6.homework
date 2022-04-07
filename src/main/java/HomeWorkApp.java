public class HomeWorkApp{
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");
        Dog dog1 = new Dog("Рекс");
        Dog dog2 = new Dog("Сэм");
        Dog dog3 = new Dog("Пират");
        Cat cat = new Cat("Барсик");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Вася");
        cat.runAway(200);
        cat1.runAway(300);
        cat2.toSwim(100);
        dog.runAway(500);
        dog1.toSwim(10);
        dog2.runAway(555);
        dog3.toSwim(100);
        System.out.printf("Количество созданных собак = %s \n" +
                "Количество созданных котиков = %s\n" +
                "Количество созданных животных = %s\n", Dog.getDogs(), Cat.getCats(), Animal.getAnimals());
    }
}
