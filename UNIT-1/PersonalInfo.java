/*
 * Write a java program to get personal information from user and display on screen.
*/

import java.util.Scanner;
class PersonalInfo 
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = scanner.nextLine();

        System.out.println("\n--- Personal Information ---");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Email : " + email);
        System.out.println("Address : " + address);
        System.out.println("Phone : " + phone);

        scanner.close();
    }
}