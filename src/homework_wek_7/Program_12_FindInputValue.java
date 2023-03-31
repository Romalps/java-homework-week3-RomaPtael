package homework_wek_7;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Program_12_FindInputValue {

    public static void main(String[] args) {

        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);

        //object creation
        Program_12_FindInputValue inputValue = new Program_12_FindInputValue();
        inputValue.checkInputIsAlphabetNumberOrSymbol(ch);
        //closing scanner object
        scanner.close();


    }

    //  find the input value is Alphbet,Digit and Symbol
    public void checkInputIsAlphabetNumberOrSymbol(char ch) {
        if ((ch > 'a' && ch <= 'z') || (ch > 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an Alphabet.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Digit.");
        } else {
            System.out.println(ch + " is a Symbol.");
        }
    }

}
