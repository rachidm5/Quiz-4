package quiz4;

import java.util.Scanner;

public class TestABC {

  static int a ;
  static int b ;
  static int c ;

   public static void main(String [] args) {

         boolean dcontinue;

     do {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter first Number \"a\" ");
         a = sc.nextInt();
         System.out.println("Enter first Number \"b\" ");
         b = sc.nextInt();
         System.out.println("Enter first Number \"c\" ");
         c = sc.nextInt();
         System.out.println("******************** OutPut **********************");

         if (a < b && b < c) {
             System.out.println("the numbers are increasing order ");
             dcontinue = true;
         } else if (a > b && b > c) {
             System.out.println("the numbers are decreasing order ");
             dcontinue = true;
         } else {
             System.out.println("the numbers are Neither increasing or decreasing order ");
             dcontinue = true;
         }
         System.out.println("\n=======================");
     }while(dcontinue == true);

   }


}
//    int a = 1524;
//    int b = 2345;
//    int c = 3321