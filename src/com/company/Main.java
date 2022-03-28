package com.company;
import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
        double celsius = 0, fahrenheit = 0;
        String trash = "";
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the temperature in celsius, ");
        if (in.hasNextInt())
        {
            celsius = in.nextInt();
        }
        else
        {
            trash = in.nextLine();
            System.out.print("You must enter a valid number for celsius " + trash);
            return;
        }
        fahrenheit = (celsius * 1.8) + 32;
        if (fahrenheit == 32)
        {
            System.out.println("The temperature in fahrenheit is " + fahrenheit + " degrees. That is freezing.");
        }
        else if (fahrenheit == 212) {

            System.out.println("The temperature in fahrenheit is " + fahrenheit + " degrees. That is boiling.");
        }
        else
        {
            System.out.println("The temperature in fahrenheit is " + fahrenheit + " degrees.");
        }
    }
}
