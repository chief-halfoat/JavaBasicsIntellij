package com.syntax.class33.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner ins = new Scanner(System.in);
        System.out.println("Please input an integer");
        try {
            int n = ins.nextInt();
        } catch (InputMismatchException inputMismatchException){
            System.out.println("Incorrect input type: Please try again and input an integer");
        } catch (Exception exception){
            System.out.println("An unknown problem occurred");
        }
    }
}
