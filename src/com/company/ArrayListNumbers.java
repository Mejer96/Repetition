package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayListNumbers {

    public static void removeMultiples() {
       ArrayList<Integer> newArraylist = removeFromArrayList(userInputNumber(), createArrayList());
       printArrayList(newArraylist);
    }

    public static ArrayList<Integer> createArrayList() {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }
      return numbers;
    }

    public static ArrayList<Integer> removeFromArrayList(int userInput, ArrayList<Integer> numbers) {

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % userInput == 0) {
                numbers.remove(i);
            }
        }
        return numbers;
    }

    public static int userInputNumber() {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        int userInput = 0;

        System.out.println("Please enter the number:");

        while (loop) {
            try {
                System.out.print(">");
                userInput = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input must be a number.");
                continue;
            }
            if (userInput > 0) {
                loop = false;
            } else {
                System.out.println("Input must be higher than zero.");
            }
        }
        return userInput;
    }

    public static void printArrayList(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
