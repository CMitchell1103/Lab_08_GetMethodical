import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double price = 0;
        String trash = "";
        boolean done = false;
        String input = "";
        boolean moreItems  = false;


        price = SafeInput.getRangedDouble(in, "Enter the price of your item ", .50,10.00);
        moreItems = SafeInput.getYNConfirm(in, "Do you have more items?");






    }
}
