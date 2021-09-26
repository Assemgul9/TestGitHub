package lesson1;

public class HomeWorkApp {

        public static void main(String[] args) {
            PrintThreeWords();
            chekSumSign();
            printColor();
            compareNumbers();
        }
        public static void PrintThreeWords(){
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
        }
        public static void chekSumSign(){
            int a = 0;
            int b = -1;
            System.out.println((a+b)>0?("Сумма положительная"):("Сумма отрицательная"));
        }
        public static void printColor(){
            int value = 100;
            if(value <= 0){
                System.out.println("Красный");
            }
            if (value <= 100){
                System.out.println("Желтый");
            }
            else{
                System.out.println("Зеленый");
            }
        }
        public static void compareNumbers(){
            int a = 4;
            int b = 3;
            System.out.println(a>=b?("a>=b"):("a<=b"));
        }

    }

