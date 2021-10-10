package Homeworks.lesson4;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {
    private static Scanner scanner;
    public static Random random;
    private static char[][] map;
    private static final int SIZE=5;
    private static final int HOW_MUCH_TO_WIN=4;
    private static final char MAP_ELEMENT_EMPTY = '_';
    private static final char MAP_ELEMENT_X = 'X';
    private static final char MAP_ELEMENT_O = 'O';

    public static void main(String[] args){
        scanner=new Scanner(System.in);
        random=new Random();
        initMap();
        printMap();

        while (true){
            playTurn();
            printMap();
            if(checkWin(MAP_ELEMENT_X)){
                System.out.println("Игра окончена!Вы выйграли!");
                break;
            }
            if(isMapFull()){
                System.out.println("Игра окончена!Ничья");
                break;
            }
            aiTurn();
            printMap();
            if(checkWin(MAP_ELEMENT_O)){
                System.out.println("Игра окончена!Вы проиграли!(((((");
                break;
            }
            if(isMapFull()){
                System.out.println("Игра окончена!Ничья");
                break;
            }
        }

    }
    public static boolean checkWin(char element){


        for (int i = 0,p=SIZE-1; i < SIZE; i++) {
            int horizontal=0;
            int vertical=0;



            for (int j = 0,x=SIZE-1; j <= SIZE-1;x--, j++) {

                if (map[i][j]==element){
                    horizontal++;


                }else if(map[i][j]!=element&&horizontal<HOW_MUCH_TO_WIN){
                    horizontal=0;
                }if(map[j][i]==element){
                    vertical++;
                }else if(map[j][i]!=element&&vertical<HOW_MUCH_TO_WIN){
                    vertical=0;
                }if(horizontal==HOW_MUCH_TO_WIN||vertical==HOW_MUCH_TO_WIN){
                    return true;
                }

            }

        }return false;


   }


    public static boolean isMapFull(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(map[i][j]==MAP_ELEMENT_EMPTY){
                    return false;
                }

            }

        }return true;
    }



    public static void playTurn(){
        int x,y;
    do {
        System.out.println("Введите координаты вашего хода ('X Y')");
        x = scanner.nextInt() - 1;
        y = scanner.nextInt() - 1;
    }while (!isMoveValid(x,y));

             map[x][y] = MAP_ELEMENT_X;

    }

    public static boolean isMoveValid(int x,int y){
        if(x < 0 || y <0 || x >=SIZE || y >=SIZE){
            return false;
        }
        if(map[x][y] != MAP_ELEMENT_EMPTY){
            return false;
        }
        return true;
    }

    public static void aiTurn(){
        int x,y;
        do{
            x= random.nextInt(SIZE);
            y= random.nextInt(SIZE);
        }while (!isMoveValid(x,y));

        map[x][y]=MAP_ELEMENT_O;
        System.out.println("AI походил в клетку  [" + (x+1) + (y+1) + " ]");
    }

    public static void printMap(){
        System.out.print("  ");
        for (int i = 1; i <=SIZE ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i+1)+" ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[j][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void initMap(){
        map = new char [SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j]=MAP_ELEMENT_EMPTY;
            }

        }
    }

}