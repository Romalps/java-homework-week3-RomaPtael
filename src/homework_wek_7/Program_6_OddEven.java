package homework_wek_7;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Program_6_OddEven {

    public static void main(String[] args) {

        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you want to check : ");
        int number = scanner.nextInt();
        Program_6_OddEven oddEven = new Program_6_OddEven();
        System.out.println(number + " is " + oddEven.isItEvenOrOddNumber(number));

        //closing scanner object
        scanner.close();


    }

    // checking the odd or even
    public String isItEvenOrOddNumber(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
