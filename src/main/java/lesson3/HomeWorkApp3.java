
package lesson3;

import java.util.Arrays;
import java.util.Scanner;


public class HomeWorkApp3 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        fifthTask();
        nextTask();
    }

    public static void fifthTask() {
        System.out.println("Введите значение длины массива");
        int len = scanner.nextInt();
        System.out.println("Введите значение индекса");
        int initialValue = scanner.nextInt();
        int[] arr3 = new int[len];
        for (int i = 0; i < len; i++) {
            arr3[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void nextTask() {
        int[] arr = {0, 1, 1, 1, 0, 1, 1, 0, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void taskTask3() {
        int[] in = new int[100];
        for (int i = 0; i < in.length; i++) {
            in[i] = i + 1;
        }
        System.out.println(Arrays.toString(in));
    }

    public static void taskTask2() {
        int[] zet = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < zet.length; i++) {
            if (zet[i] > 6) {
                zet[i] = i / 2;
            }
        }
        System.out.println(Arrays.toString(zet));
    }

    public static void taskTask() {
        int[][] arr2 = new int[5][5];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0, x = arr2.length - 1; j < arr2.length; j++, x--) {
                if (i == j) {
                    arr2[i][j] = 1;
                    arr2[i][x] = 1;
                }
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void sixTask(){
        int[]arr4=new int[]{123, 24, 47, 89, 90,23};


    }
}