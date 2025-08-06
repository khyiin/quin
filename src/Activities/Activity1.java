package Activities;

import java.util.Scanner;

public class Activity1 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String name;
      int science, history, math, soc, arts, totalmarks, totalpercentage;
    

    System.out.print("Enter your name:");
    name = sc.nextLine();
    System.out.print("Enter marks in Science:");
    science = sc.nextInt();
    System.out.print("Enter marks in History:");
    history = sc.nextInt();
    System.out.print("Enter marks in Math:"); 
    math =sc.nextInt();
    System.out.print("Enter marks in Soc:");
    soc = sc.nextInt();
    System.out.print("Enter marks in Arts:");
    arts = sc.nextInt();
    
    
  totalmarks= science+ history+math+soc+arts;
  System.out.println("Total Marks:"+totalmarks);
  
  totalpercentage= totalmarks/5;
  System.out.println("Total Percentage:"+ totalpercentage);
    System.out.print("Remarks:");
 
 if (totalpercentage >= 0 && totalpercentage <= 70) {
        System.out.println("Fail, please try again");
    } else if (totalpercentage>=71 && totalpercentage <= 75){
        System.out.println("Poor");
    } else if (totalpercentage >= 76 && totalpercentage <= 80){
        System.out.println("Fair");   
    } else if (totalpercentage >= 81 && totalpercentage <= 85){
        System.out.println("Good");
    } else if (totalpercentage >= 86 && totalpercentage <= 90) {
        System.out.println("Very Good");
    } else if (totalpercentage >= 91 && totalpercentage <= 100) {
        System.out.println("Excellent");
  
  }
  if (totalpercentage>=70) {
    System.out.println("Congratulations, " + name+ " you passed!" );
    }
}
}
