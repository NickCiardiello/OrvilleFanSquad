package LessonOne;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        helloWorld();
//        helloName();
//        printFirstInt();
//        operators();
//        stringConcatenation();
//        casting();
//        stringAndVariableConcatenation();
//        scannerNextInt();
    }

    public static void helloWorld() {
        System.out.println("Hello World!");
    }

    public static void helloName() {
        System.out.println("Hello myName");
    }

    public static void printFirstInt() {
        int myInt = 69;
        System.out.println(myInt);
    }

    public static void operators() {
        int intOne = 10;
        int intTwo = 3;
        int sum = intOne + intTwo;
        System.out.println(sum);
    }

    public static void stringConcatenation() {
        String hello = "Hello";
        System.out.println(hello);
        String world = "World";
        String space = " ";
        System.out.println(hello + space + world);
        System.out.println(hello + " " + world);
        System.out.println(hello + " world");
    }

    public static void stringAndVariableConcatenation() {
        System.out.println("Hello Nick, I've seen Zedd 5 times");
        // Answer goes here
    }

    public static void scannerNextLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who are you greeting?");
        String nicksName = scanner.nextLine();  // Read user input
        System.out.println("Hi " + nicksName);  // Output user input
        // Answer goes here
    }

    public static void scannerNextInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        // Answer goes here
    }

    public static void calculator() {
        // Answer goes here
    }
}

















