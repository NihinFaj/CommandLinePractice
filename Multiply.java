
/**
 * A program that mutiplies 2 numbers together
 *
 * @author (Nihinlolamiwa Fajemilehin)
 * @version (19th of December 2019)
 */
public class Multiply
{

    /**
     * Constructor for objects of class Multiply
     */
    public Multiply()
    {
    }

    /**
     * Main method that multiply numbers together
     */
    public static void main(String[] args)
    {
        int result = Integer.parseInt(args[0]) * Integer.parseInt(args[1]);
        System.out.println(result + "");
    }
}