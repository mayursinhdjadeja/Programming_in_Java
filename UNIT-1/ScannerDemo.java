/*
 * Write a java program to get different values from user at runtime using Scanner.
*/

import java.util.Scanner;
public class ScannerDemo 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age (integer): ");
        int age = scanner.nextInt();

        System.out.print("Enter your height (double): ");
        double height = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        scanner.nextLine();

        System.out.print("Enter your full name (string): ");
        String name = scanner.nextLine();

        System.out.print("Enter the first letter of your name (char): ");
        char firstChar = scanner.next().charAt(0); 

        System.out.println("\n--- Your Details ---");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Height : " + height + " m");
        System.out.println("Student? : " + isStudent);
        System.out.println("First letter : " + firstChar);

        scanner.close();
    }
}