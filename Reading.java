import java.io.DataInputStream;
class Reading 
{
  public static void main(String args[])
  {
    DataInputStream in = new DataInputStream (System.in);
    int intnumber = 0;
    float floatnumber = 0.0f;
    try
    {
         System.out.println("enter an integer: ");
         intnumber = Integer.parseInt (in.readLine());
         System.out.println("Enter an float number:");
         floatnumber = Float.valueOf (in.readLine()) . floatValue();
    }
    catch (Exception e) { }
    System.out.println("intNumber = " + intnumber);
    System.out.println("floatnumber = " + floatnumber);
  }
}