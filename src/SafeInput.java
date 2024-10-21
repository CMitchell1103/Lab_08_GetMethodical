import java.util.Scanner;

public class SafeInput
{
    /**
     * get a string val form the user which must be at least one character
     *
     * @param pipe scanner to use to read the input
     * @param prompt prompt to tell the user what is input
     * @return String that is at least one character
     */

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retVal = "";

        do {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();
            if(retVal.isEmpty())
            {
                System.out.println("You must enter at least one character!");
            }

        } while(retVal.isEmpty());

        return retVal;

    }

    /**
     * get an unconstrained int value from the user
     *
     * @param pipe Scanner to use for input
     * @param prompt prompt that tells the user what to input
     * @return an unconstrained value
     */
    public static int getInt(Scanner pipe, String prompt)

    {

        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            if(pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer not " + trash);
            }

        } while(!done);

        return retVal;

    }
    /**
     * get an unconstrained double value from the user
     *
     * @param pipe Scanner to use for input
     * @param prompt prompt that tells the user what to input
     * @return an unconstrained double value
     */
    public static double getDouble(Scanner pipe, String prompt)

    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double not " + trash);
            }

        } while(!done);

        return retVal;

    }

}