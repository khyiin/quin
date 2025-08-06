package Activities;

import java.util.Scanner;

public class Activity3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Enter a number:");
        number = sc.nextInt();

        if (number > 0) {
            System.out.println("Inputted number is positive.");
        } else if (number < 0) {
            System.out.println("Inputted number is negative.");
        } else {
            System.out.println("Inputted number is 0.");
        }

    }
}