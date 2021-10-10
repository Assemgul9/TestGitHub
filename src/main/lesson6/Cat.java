package lesson6;

public class Cat extends Animal {

    public Cat(String name, int age, String color){
        this.name=name;
        this.age=age;
        this.color=color;

    }


    @Override
    public void swimming(int distance) {
        System.out.println("Коты не умеют плавать!" + name+ " ,увы,  утонул");

    }



    public void running(int distance){
        if(distance>=200){
            System.out.println(name+" пробежал "+ distance + " м");
        }else {
            System.out.println(name+" слишком толстый, чтобы  пробежать "+distance+" м,нужна дистанция поменьше");
        }
    }
}
