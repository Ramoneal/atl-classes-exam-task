package main.java.az.atlacademy.examtasks;

import java.util.Scanner;

public class OddDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0 && i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
