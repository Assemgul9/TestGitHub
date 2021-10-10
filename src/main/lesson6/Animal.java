package lesson6;

   public abstract class Animal {
    protected String name;
    protected int age;
    protected String color;
    protected int distance;



    public void info(){
        System.out.println(name + " " + age+" " +color);

    }

    public  void running(int distance){
        System.out.println(name + " " + "пробежал" + distance);

    }
    public void swimming(int distance){
        System.out.println(name + " "+ "проплыл" +distance);
    }
}
