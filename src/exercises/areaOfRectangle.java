package exercises;
import java.util.Scanner;


public class areaOfRectangle {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Enter the length of the rectangle in cm?");
      Double lengthNum = input.nextDouble();

      System.out.println("Enter the width of the rectangle?.");
      Double widthNum = input.nextDouble();

      Double area =lengthNum*widthNum ;
      System.out.println("The rectangle area is  " + area + " cm^2.");
   }
}
