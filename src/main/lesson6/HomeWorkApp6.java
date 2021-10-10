package lesson6;

public class HomeWorkApp6 {
    public static void main(String[] args){
        int CountDog=0;
        int CountCat=0;
        Animal[] animals= {
                new Cat("Спагетти",5,"Серый"),
                new Cat("Сосиска",3,"желтый"),
                new Dog("Брокколи", 5, "черый"),
                new Dog("Брюссельская", 7, "коричневый")

        };for(Animal animal:animals){
            if(animal instanceof Cat){
                ((Cat)animal).running(150);
//коты не умеют плавать, поэтому в консоль выведется, что кот утонул
            }if(animal instanceof Cat){
                ((Cat)animal).swimming(150);

            }if(animal instanceof Dog){
                ((Dog)animal).running(200);

            }if(animal instanceof Dog){
                ((Dog)animal).swimming(3);

            }if(animal instanceof Dog){
                CountDog++;

            }if(animal instanceof Cat){
                CountCat++;
            }



        }
        System.out.println("У нас слишком много кошек: " + CountCat);
        System.out.println("У нас так мало собак: "+CountDog);
    }


}
