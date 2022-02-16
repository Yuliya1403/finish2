package com.max.idea;
//import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.println("Введите уравнение: ");

        String[] result = input.nextLine().split("");
        String operation = result[1];

        if (result[0].equals("x")) {
            int a = Integer.parseInt(result[2]);
            int b = Integer.parseInt(result[4]);

            if (operation.equals("+")) {
                System.out.println("Результат: " + (b - a));
            } else {
                System.out.println("Результат: " + (a + b));
            }
        } else if (result[2].equals("x")) {
            int a = Integer.parseInt(result[0]);
            int b = Integer.parseInt(result[4]);

            if (operation.equals("+")) {
                System.out.println("Результат: " + (b - a));
            } else {
                System.out.println("Результат: " + (a - b));
            }
        } else {
            int a = Integer.parseInt(result[0]);
            int b = Integer.parseInt(result[2]);

            if (operation.equals("+")) {
                System.out.println("Результат: " + (a + b));
            } else {
                System.out.println("Результат: " + (a - b));
            }
        }
    }
}
    
     




























































































































