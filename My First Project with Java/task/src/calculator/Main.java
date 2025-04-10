package calculator;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double gumSold = 202;
        double toffeeSold = 118;
        double iceCreamSold = 2250;
        double milkChocSold = 1680;
        double doughnutSold = 1075;
        double pancakeSold = 80;

        double income = gumSold +
                        toffeeSold +
                        iceCreamSold +
                        milkChocSold +
                        doughnutSold +
                        pancakeSold;
        double netIncome = 0;



        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $" + gumSold);
        System.out.println("Toffee: $" + toffeeSold);
        System.out.println("Ice cream: $" + iceCreamSold);
        System.out.println("Milk chocolate: $" + milkChocSold);
        System.out.println("Doughnut: $" + doughnutSold);
        System.out.println("Pancake: $" + pancakeSold);
        System.out.println("Income: $" + income);


        System.out.println("Staff expenses: $");
        double staffExpenses = scanner.nextDouble();
        System.out.println("Other expenses: $");
        double otherExpenses = scanner.nextDouble();
        netIncome = income - staffExpenses - otherExpenses;
        System.out.println("Net income: $" + netIncome);
        scanner.close();
    }
}