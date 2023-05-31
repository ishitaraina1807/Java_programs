class whileTest {
    public static void main (String args[])
{
    StringBuffer string = new StringBuffer();
    char c;
    System.out.println("Enter a string");
    try
    {
        while(( c = (char)System.in.read())  != '\n')
        {
            string.append(c);
        }
    }
    catch (Exception e)
    {
        System.out.println("ERROR");
    }
    System.out.print("you have entered...");
    System.out.println(string);
}
}