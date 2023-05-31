class Add 
{
    float n1;
    float n2;
    void getdata (float a, float b)
    {
        n1 = a;
        n2 = b;
    }
}
public class Addition 
{
public static void main(String arg[])
{
    float sum, n1, n2;
    Add addnum = new Add (); 
    addnum.getdata(273, 114);
    sum = addnum.n1 + addnum.n2 ; 
    System.out.println("Sum of number = " + sum);
}
}