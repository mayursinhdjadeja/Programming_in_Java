/*
 * Write a java program to get a name from user and display on screen.
*/

import java.util.Scanner;
class DisplayName 
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println(name);

        scanner.close();
    }
}