/* Giorgi Amirajibi */

import java.util.*;

public class seconds
{
    public static void main (String[] args) {
        int hours, minutes, seconds;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter amount of hours: ");
        hours = keyboard.nextInt();
        System.out.println("Please enter amount of minutes: ");
        minutes = keyboard.nextInt();
        System.out.println("Please enter amount of seconds: ");
        seconds = keyboard.nextInt();
        if (hours > 0 && minutes > 0 && seconds > 0)
            {
                System.out.println("Total amount of seconds: " + (hours * 3600 + minutes * 60 + seconds));
            }
        else
            {
                System.out.println("You've entered a negative number");
            }
    }
}
