
/**
 * A program that performs operations on two integers based on the operands passed
 *
 * @author (Nihinlolamiwa Fajemilehin)
 * @version (19th of December 2018)
 */
public class result
{
    /**
     * Constructor for objects of class result
     */
    public result()
    {
    }
    
    public static void main(String[] args)
    {
        int finalResult = 0;
        if(args[0].equals("+")) {
            finalResult = Integer.parseInt(args[1]) + Integer.parseInt(args[2]);
        }
        else if(args[0].equals("-")) {
            finalResult = Integer.parseInt(args[1]) - Integer.parseInt(args[2]);
        }
        else if(args[0].equals("*")) {
            finalResult = Integer.parseInt(args[1]) * Integer.parseInt(args[2]);
        }
        else if(args[0].equals("/")) {
            finalResult = Integer.parseInt(args[1]) / Integer.parseInt(args[2]);
        }
        System.out.println(finalResult + "");
    }
}