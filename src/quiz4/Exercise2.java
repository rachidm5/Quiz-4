package quiz4;

import java.util.Scanner;

public class Exercise2 {

    static int age;
    static int underAge;

    public static void main(String [] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter your age : ");
            age = sc.nextInt();

            System.out.println("\n****************** OutPut ***********************");
            if(age >= 18){
            System.out.println("You are eligible to vote");
            }else{
                underAge = 18 - age ;
                System.out.printf("Sorry You are not  eligible to vote please comeback in %d Years ",underAge);

            }


        }
}
