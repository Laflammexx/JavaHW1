/* Giorgi Amirajibi */

import java.util.*;

public class floating
{
    public static void main (String [] args)
    {
        float firstNumber, secondNumber;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your first number: ");
        firstNumber = keyboard.nextFloat();
        System.out.println("Please enter your second number");
        secondNumber = keyboard.nextFloat();
        System.out.println("Sum of your two numbers is: " + (firstNumber + secondNumber));
        System.out.println("Difference between your two numbers is: " + (firstNumber - secondNumber));
        System.out.println("Product of your two numbers is: " + firstNumber * secondNumber);

    }
}
