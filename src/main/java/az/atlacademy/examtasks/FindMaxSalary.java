package main.java.az.atlacademy.examtasks;

import java.util.Scanner;


public class FindMaxSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float salary1 = scanner.nextFloat();
        float salary2 = scanner.nextFloat();
        if (salary1 >= salary2) {
            System.out.println(salary1);
        } else {
            System.out.println(salary2);
        }


    }
}
