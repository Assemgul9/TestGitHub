package lesson_7;

public class Main {
    public static void main(String[] args) {
        Plate plate=new Plate(10);
        Cat [] cats={
            new Cat("Барсик"),
            new Cat("Гав"),
            new Cat("Кактус"),
        };

        for (Cat cat : cats)
        if (plate.info()){
            cat.info();
            cat.eat(plate);
            cat.info();

            }
    }
}
