package lesson_7;

public class Plate {
    private int food;

    public Plate(int food){
        this.food=food;
    }
    public void decreaseFood(int amount){
       food-=amount;
    }

    public int getFood() {
        return food;
    }

    public void moreFood(int amount){
        food+=amount;
    }

    public boolean info(){
        if (food<0){
            System.out.println("Вы не можете положить отрицательное количество еды в тарелку");
            return false;
        }
        else{
            System.out.printf("Plate [Food: %d] \n",food);
            return true;
        }

    }

}
