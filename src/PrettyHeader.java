
public class PrettyHeader
{
    public static void main(String[] args)
    {
        prettyHeader("Message Centered Here");
    }
    /**
     *
     * @param msg title for header
     */
    public static void prettyHeader(String msg)
    {
        int width = 60;
        for (int i = 0; i < width; i++)
        {
            System.out.print("*");
        }
        System.out.println();
        int msgLen = msg.length();
        int space = (width - msgLen - 6) / 2;
        System.out.println("***");
        for (int i = 0; i < space; i++)
        {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < space; i++)
        {
            System.out.print(" ");
        }
        System.out.println("***");
        for(int i = 0; i < width; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
