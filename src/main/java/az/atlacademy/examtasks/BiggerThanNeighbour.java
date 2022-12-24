package main.java.az.atlacademy.examtasks;

import java.util.Scanner;

public class BiggerThanNeighbour {
    public static void main(String[] args) {
        int[] arr = new int[7];
        System.out.println(array(arr));


    }

    public static int array(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            Scanner scanner = new Scanner(System.in);
            arr[i] = scanner.nextInt();

        }
        for (int i = 1; i < arr.length - 1; i++) {

            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
               count++ ;

            }
        }
        return count;

    }
}
