public class Methods
{
    
    int a = 10;
    
    public void MessagePass()
    {
        System.out.println("Hello Method");    
    }
    public static void main(String [] args)
    {
        Methods obj = new Methods();
        obj.MessagePass();
    }
}