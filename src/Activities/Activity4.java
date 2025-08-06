package Activities;

import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.next();

        System.out.print("Enter hourly rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter total hours worked this week: ");
        int hours = sc.nextInt();

        double wage = rate * hours;
        double sss = wage * 0.10;
        double netWage = wage - sss;

        System.out.println("\n---- Wage Summary ----");
        System.out.println("Employee: " + name);
        System.out.printf("Hourly Rate: ₱%.2f\n", rate);
        System.out.println("Hours Worked: " + hours);
        System.out.printf("Gross Weekly Wage: ₱%.2f\n", wage);
        System.out.printf("SSS Contribution (10%%): ₱%.2f\n", sss);
        System.out.println("----------------------");
        System.out.printf("Net Weekly Wage: ₱%.2f\n", netWage);
    }
}