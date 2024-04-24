import java.util.InputMismatchException;
import java.util.Scanner;

public class C00L1N_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🟢 what if the user inputs a string accidentally?
        // 🟢 what if the user chooses division but the second number is 0
        // 🚩 clean my code

        int firstNum = 0;
        while(true) {
            try {
                System.out.print("Enter First Number : ");
                firstNum = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Must be an integer");
                sc.next();
            }
        }

        int secondNum = 0;
        while(true) {
            try {
                System.out.print("Enter Second Number : ");
                secondNum = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Must be an integer");
                sc.next();
            }
        }

        System.out.println("""
                Welcome to Calculator 🧮
                Please choose the method in which you want to solve
                [1️⃣] ➕ Addition ➕
                [2️⃣] ➖ Subtraction ➖
                [3️⃣] ➗ Division ➗
                [4️⃣] ✖️ Multiplication ✖️
                """);

        int choose = 0;
        try {
            System.out.print("Enter Method : ");
            choose = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Must be an integer");
            sc.next();
        }

        switch (choose) {
            case 1 -> System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
            case 2 -> System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
            case 3 -> {
                if (secondNum == 0) {
                    System.out.println("Cannot be divided by zero");
                } else {
                    System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
                }
            }
            case 4 -> System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
            default -> System.out.println("Invalid❌");
        }
    }
}