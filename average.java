/* Giorgi Amirajibi */

import java.util.*;

public class average
{
    public static void main (String[] args)
    {
        int firstNumber, secondNumber, thirdNumber;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        firstNumber = keyboard.nextInt();
        System.out.println("Please enter second number: ");
        secondNumber = keyboard.nextInt();
        System.out.println("Please enter third number: ");
        thirdNumber = keyboard.nextInt();
        System.out.println( ("Your average is: " + (firstNumber+secondNumber+thirdNumber)/3));
    }
}
