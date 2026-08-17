/*
 * Write a java program to find out students result/grade using IF condition.
*/

import java.util.Scanner;
class StudentGrade 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        if (marks >= 90)
        {
            System.out.println("Grade: 0");
        } 
        else if (marks >= 80) 
        {
            System.out.println("Grade: A+");
        } 
        else if (marks >= 70) 
        {
            System.out.println("Grade: A");
        } 
        else if (marks >= 40) 
        {
            System.out.println("Grade: D");
        } 
        else 
        {
            System.out.println("Grade: F (Fail)");
        }

        sc.close();
    }
}