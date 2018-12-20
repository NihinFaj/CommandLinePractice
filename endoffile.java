import java.util.Scanner;

/**
 * A program to experiment with End of File
 *
 * @author (Nihinlolamiwa Fajemilehin)
 * @version (20th of December 2018)
 */
public class endoffile
{
    /**
     * Constructor for objects of class endoffile
     */
    public endoffile()
    {
    }

    public static void main(String[] args)
    {
        int i = 0;
        int eofArray[] = new int[7];
        Scanner s = new Scanner(System.in);
        
        while (s.hasNextInt()) {
            eofArray[i] = s.nextInt();
            i++;
        }
        while (i >= 0) {
            System.out.println(eofArray[i]);
            i--;
        } 
    }
}