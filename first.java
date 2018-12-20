import java.util.Scanner;

/**
 * a program named first that reads from standard input an arbitrary number of integers
(ended with an EOF character) and writes to standard out the largest integer read.
 *
 * @author (Nihinlolamiwa Fajemilehin)
 * @version (20th of December 2018)
 */
public class first
{
    /**
     * Constructor for objects of class first
     */
    public first()
    {
    }

    public static void main(String[] args)
    {
        int i = 0;
        int eofArray[] = new int[100];
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {
            eofArray[i] = s.nextInt();
            i++;
        }
        
        int largestValue = eofArray[0];
        
        for(i= 0; i < eofArray.length; i++) { 
            if(eofArray[i] > largestValue) {
                largestValue = eofArray[i];
            }
        }
        
        System.out.println("Largest value is: " + largestValue);
        
    }
}