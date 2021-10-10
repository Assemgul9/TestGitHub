package lesson6;

public class Dog extends Animal {
    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public void swimming(int distance) {
        if(distance<=10){
            System.out.println("Пес "+name+ " проплыл " + distance+ " м");
        }else{
            System.out.println(name+"утонул");
        }
    }

    @Override
    public  void running(int distance) {
        if(distance<=500){
            System.out.println("Пес "+name+ " пробежал "+distance+ " м");
        }else {
            System.out.println(name+ " слишком устал, чтобы так далеко бежать");
        }
    }
}



