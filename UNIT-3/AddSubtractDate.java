/*
 * Write a java program to add, subtract a days/month into current date and time  
*/

import java.time.LocalDateTime;
class AddSubtractDate 
{
    public static void main(String args[]) 
    {
        LocalDateTime current = LocalDateTime.now();
        System.out.println("Current Date and Time: " + current);
        System.out.println("After adding 5 days: " + current.plusDays(5));
        System.out.println("After subtracting 5 days: " + current.minusDays(5));
        System.out.println("After adding 2 months: " + current.plusMonths(2));
        System.out.println("After subtracting 2 months: " + current.minusMonths(2));
    }
}