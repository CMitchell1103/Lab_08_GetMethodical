import java.util.Scanner;

public class FavNum {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int favoriteNum = 0;
        String trash = "";
        boolean done = false;
        double favNum = 0;
        favoriteNum = SafeInput.getInt(in, "Enter your favorite int");
        favNum = SafeInput.getDouble(in, "Enter your favorite double");
        System.out.println("Your favorite int is: " + favoriteNum + "\nYour favorite double is: " + favNum);



    }
}
