package activities;

import java.util.Scanner;

public class airfare {

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Class 1: Economy Class");
        System.out.println("Class 2:Business Class");
        
        System.out.print("Distance(km):");
        int distance= sc.nextInt();
        System.out.print("Class:");
        int cl= sc.nextInt();
        
        double totalPrice=0;
        double Price;
        double airfare;
        double class1Price= 250;
        double class2Price=500;
        
        if (cl==1) {
            totalPrice= class1Price*distance;
        } else if (cl==2) 
            totalPrice= class2Price*distance;      
        
         if (distance > 1000) {
            double discount = totalPrice * 0.10;  
            totalPrice -= discount;  
         }
        System.out.printf("Total Price: %.2f\n", totalPrice);
    }
    
}