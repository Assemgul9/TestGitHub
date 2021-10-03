
package lesson3;

import java.util.Arrays;
import java.util.Scanner;


public class HomeWorkApp3 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        fifthTask();
        nextTask();
        sixTask();
        taskTask3();
        taskTask2();
        taskTask();
        seventhTask(new int[]{23, 23, 45, 56, 11, 2, 1, 9, 17, 4});
        eighthTask(new int[]{1, 2, 3, 4, 5,}, 1);
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
            for (int j = 0; j < arr2.length; j++) {
                if (i == j || i == arr2.length - 1 - j) {
                    arr2[i][j] = 1;
                }
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sixTask() {
        int[] arr4 = new int[]{0, 24, 47, 89, 90, 23};
        int max = arr4[0];
        int min = arr4[0];
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] > max) {
                max = arr4[i];
            }
            for (int j = 0; j < arr4.length; j++) {

                if (arr4[i] < min) {
                    min = arr4[i];
                }
            }
        }
        System.out.println("Максимальное число " + max + " Минимальное число " + min);
    }

    public static boolean seventhTask(int[] arr5) {

        for (int i = 0; i < arr5.length; i++) {
            int sumRight = 0;
            int sumLeft = 0;

            for (int j = 0; j < i; j++) {
                sumRight += arr5[j];
            }
            for (int j = i; j < arr5.length; j++) {
                sumLeft += arr5[j];

                if (sumRight == sumLeft)

                    return true;
            }
            System.out.println(sumRight=sumLeft);

        }
        return false;
    }

    public static void eighthTask(int[] arr6, int shift) {

        int arrLength = arr6.length;
        if (shift > 0) {
            for (int i = 0; i < shift; i++) {
                int temp = arr6[arrLength - 1];
                for (int j = arrLength - 1; j > 0; j--) {
                    arr6[j] = arr6[j - 1];
                }
                arr6[0] = temp;
            }
        }
        if (shift < 0) {

            for (int i = 0; i > shift; i--) {
                int temp = arr6[0];
                for (int m = 0; m < arrLength - 1; m++) {
                    arr6[m] = arr6[m + 1];
                }
                arr6[arrLength - 1] = temp;
            }



        }System.out.print(Arrays.toString(arr6));
    }
}