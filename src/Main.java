import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Math.round;

public class Main{
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter x: ");

        double x =scanner.nextDouble();

        System.out.println("Enter Y:");
        double y= scanner.nextDouble();
        //Calculate the hypotenuse/ e
        float z=(float)Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse of the triangle is " + z);


        }
    }
