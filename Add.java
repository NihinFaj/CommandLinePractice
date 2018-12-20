
/**
 * A program to add numbers together
 *
 * @author (Nihinlolamiwa Fajemilehin)
 * @version (19th of December 2018)
 */
public class Add
{
    /**
     * Constructor for objects of class Add
     */
    public Add()
    {
    }

    /**
     * Man method that sums up integers
     */
    public static void main(String[] args)
    {
        int result = 0;
        for(String s : args) {
            result += Integer.parseInt(s);
        }
        System.out.println(result + "");
    }
}
