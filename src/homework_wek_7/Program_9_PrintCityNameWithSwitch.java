package homework_wek_7;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Scanner;

/**
 * Input any alphabet from “A to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry USING SWITCH STATEMENT
 */
public class Program_9_PrintCityNameWithSwitch {

    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F : ");
        String city = scanner.next().toUpperCase();

        //create object and call instance method
        Program_9_PrintCityNameWithSwitch cityName = new Program_9_PrintCityNameWithSwitch();
        cityName.printCityName(city);
//closing the scanner object
        scanner.close();

    }

    // printing city name
    public void printCityName(String city) {
        switch (city) {
            case "A":
                System.out.println("Aberdeen");
                break;
            case "B":
                System.out.println("Belfast");
                break;
            case "C":
                System.out.println("Cambridge");
                break;
            case "D":
                System.out.println("Derby");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Feltham");
                break;
            default:
                System.out.println("The alphabet you enter is not between A and F");
        }
    }
}