/* Giorgi Amirajibi */

import java.util.*;

public class personalinfo
{
    public static void main (String[] args)
    {
        String name, college, petsName;
        int age;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        name = keyboard.nextLine();
        System.out.println("Please enter your age: ");
        age = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Please enter your college: ");
        college = keyboard.nextLine();
        System.out.println("Please enter your pet's name: ");
        petsName = keyboard.nextLine();
        System.out.println("Hello, my name is " + name + " and I am " + age + " years\n" +
                            "old. I'm enjoying my time at " + college + ", though\nI miss " +
                            "my pet " + petsName + " very much!");

    }
}
