package lesson_7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isHungry;
    private boolean isSatiety;

    public Cat(String name){
        this.name=name;
        appetite=5;
        this.isHungry=true;
        this.isSatiety=false;
    }

    public String getName() {
        return name;
    }

    public int getAppetite(){
        return appetite;

    }
    public void setHungry(boolean hungry){
        isHungry=hungry;

    }

    public void setSatiety(boolean satiety){
        isSatiety=satiety;

    }
    public void eat(Plate plate){
        if(plate.getFood()>=appetite){
        plate.decreaseFood(appetite);
        System.out.println(name + " поел из тарелки");
        isSatiety=true;
        System.out.println(name + " наелся до отвала");
        }
        else if(plate.getFood()<appetite){
            System.out.println("В тарелке осталось слишком мало еды, давайте добавим " + appetite);
            plate.moreFood(appetite);
            plate.info();
            plate.decreaseFood(appetite);
            System.out.println(name + " наконец-то поел из тарелки, теперь он сыт, как никогда");
            isSatiety=true;
            plate.info();
        }
        else{
            isHungry=true;
            System.out.println((name+ " остался голодным, потому что в тарелке слишком мало еды"));

        }
    }

    public void info(){
        System.out.println("Name: " + name + ", satiety: " + isSatiety);
    }


}
