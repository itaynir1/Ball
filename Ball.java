/*
*Author - Itay Nir
* this program calculate the area and the cubage of ball.
 */

import java.util.Scanner;
public class Ball
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int radius;
        System.out.println("you should enter radius "+" and this program calculate area and volume of ball");
        radius = scan.nextInt();
        final double PI= 3.14;
        double volume=(4*PI*Math.pow(radius, 3 ))/3; //formula for cubage ball.
        double area=4*PI*Math.pow(radius, 2);// formula for surface of ball.

        System.out.println(" the area of ball is " + area );
        System.out.println("and the volume of ball is"+ volume);

    }
}
