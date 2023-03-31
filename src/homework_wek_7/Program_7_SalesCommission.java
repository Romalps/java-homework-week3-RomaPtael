package homework_wek_7;

import java.util.Scanner;

/**
 * Write a java program input seller id, sellers name, sales amount, and basic salary
 * then fined this sales
 * Commission
 * Sales amount &gt;= 50,000 35%
 * Sales amount &gt;= 30,000 20%
 * &gt;= 20,000 10%
 * &gt;= 10,000 5%
 * &lt; 10,000 2%
 */
public class Program_7_SalesCommission {

    public static void main(String[] args) {

        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter seller Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter seller ID: ");
        int sellerId = scanner.nextInt();
        System.out.print("Enter sales Amount: ");
        int sellerAmount = scanner.nextInt();
        System.out.print("Enter Basic Salary: ");
        int basicSalary = scanner.nextInt();

        //creating the object to call instance method
        Program_7_SalesCommission salesCommission = new Program_7_SalesCommission();
        int grossSalary = basicSalary + salesCommission.calculateCommission(sellerAmount);
        System.out.println("Seller name is                : " + name);
        System.out.println("Seller ID is                  : " + sellerId);
        System.out.println("Seller's sales amount is      : " + sellerAmount);
        System.out.println("Seller's basic salary is      : " + basicSalary);
        System.out.println("Seller's gross salary is      : " + grossSalary);

        //closing scanner object
        scanner.close();
    }

    // calculating the sales commission
    public int calculateCommission(int salesAmount) {
        int commission;
        if (salesAmount >= 50000) {
            commission = (salesAmount * 35) / 100;
            System.out.println("Sales commission is : " + commission);
        } else if (salesAmount >= 30000) {
            commission = (salesAmount * 20) / 100;
            System.out.println("Sales commission is : " + commission);
        } else if (salesAmount >= 20000) {
            commission = (salesAmount * 10) / 100;
            System.out.println("Sales commission is : " + commission);
        } else if (salesAmount >= 10000) {
            commission = (salesAmount * 5) / 100;
            System.out.println("Sales commission is : " + commission);
        } else {
            commission = (salesAmount * 2) / 100;
            System.out.println("Sales commission is : " + commission);
        }
        return commission;
    }
}
