import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int minute = 0;
        String trash = "";
        boolean done = false;
        int lowYear = 1950;
        int highYear = 2015;
        int maxDays = 0;


        year = SafeInput.getRangedInt(in, "Enter the year you were born in ",1950,2015);
        month = SafeInput.getRangedInt(in, "Enter the month you were born in ",1,12);
        maxDays = switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 29;
            default -> maxDays;
        };
        hour = SafeInput.getRangedInt(in, "Enter the hour you were born in ",1,24);
        minute = SafeInput.getRangedInt(in, "Enter the minute you were born in ",1,59);





    }



}
