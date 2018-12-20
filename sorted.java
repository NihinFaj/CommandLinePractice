import java.util.Scanner;
import java.util.Arrays;

/**
 * A program named sorted that takes a single argument k then reads from standard input
 * a exactly k integers (ended with an EOF character) and writes to standard out the same integers,
 * but sorted from smallest to largest.
 *
 * @author (Nihinlolamiwa Fajemilehin)
 * @version (20th of December 2018)
 */
public class sorted
{
    /**
     * Constructor for objects of class sorted
     */
    public sorted()
    {
    }

    public static void main(String[] args)
    {
        int i = 0;
        int arraySize = Integer.parseInt(args[0]) ;

        int myArray[] = new int[arraySize];
        Scanner s = new Scanner(System.in);

        while (s.hasNextInt()) {
            if(i < myArray.length) {
                myArray[i] = s.nextInt();
                i++;
            }
            else {
                System.out.println("Array size has been exceeded");
                System.exit(0);
            }
        }

        Arrays.sort(myArray);
        for(int value : myArray) {
            System.out.println(value);
        }
    }
}
