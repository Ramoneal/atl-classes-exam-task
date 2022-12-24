package main.java.az.atlacademy.examtasks;

public class FindMaxArray {
    public static void main(String[] args) {
        int[] arr = {12, 3, 12, 5, 7};
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max + " " + index);

    }
}
