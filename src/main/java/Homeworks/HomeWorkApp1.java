package Homeworks;

public class HomeWorkApp1 {
    public static void main(String[] args) {

        System.out.println(sumNumbersWithinTenAndTwenty(5, 11));
        numberNegativeOrPositive(-8);
        System.out.println(numberNop(-9));
        wordToConsole("Асемгуль", 4);
        System.out.println(whichYear(400));

    }
    public static boolean sumNumbersWithinTenAndTwenty(int a1, int a2) {
        return (a1 + a2 >= 10 && a1 + a2 <= 20);
    }
    public static void numberNegativeOrPositive(int b) {
        System.out.println(b >= 0 ? ("положтельное") : ("отрицательное"));
    }
    public static boolean numberNop(int c) {
        return (c < 0);
    }
    public static void wordToConsole(String name, int b) {
        for (int c = 0; c < b; c++) {
            System.out.println(name);
        }
    }
    public static boolean whichYear(int a) {
       return ((a%4==0)&&(a%100!=0))||(a%400==0);


    }




}
