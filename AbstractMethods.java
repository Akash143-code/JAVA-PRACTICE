abstract class demo
{
    
    abstract public void MessagePass();//abstract_method
}

public class AbstractMethods extends demo
{
    public void MessagePass()
    {
        System.out.println("Hi,This is abstract:");    
    }
    
    public static void main (String [] args)
    {
        AbstractMethods obj = new AbstractMethods();//object_reference
        obj.MessagePass();// method_call
    }
}
    
  