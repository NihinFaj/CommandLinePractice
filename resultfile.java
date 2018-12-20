import java.util.Scanner;

/**
 * A program that performs operations on two integers based on the operands passed from the Standard Input
 *
 * @author (Nihinlolamiwa Fajemilehin)
 * @version (18th of December 2018)
 */
public class resultfile
{
    /**
     * Constructor for objects of class resultfile
     */
    public resultfile()
    {
    }

    public static void main(String[] args)
    {
        int finalResult = 0;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter your arithmetic operator");
        String operator = s.nextLine();
        
        System.out.println("Enter your first integer");
        int firstInt = s.nextInt();
        
        System.out.println("Enter your second integer");
        int secondInt = s.nextInt();
        
        if(operator.equals("+")) {
            finalResult = firstInt + secondInt;
        }
        else if(operator.equals("-")) {
            finalResult = firstInt - secondInt;
        }
        else if(operator.equals("*")) {
            finalResult = firstInt * secondInt;
        }
        else if(operator.equals("/")) {
            finalResult = firstInt / secondInt;
        }
        
        System.out.println("The result is : " + finalResult);
    }
}