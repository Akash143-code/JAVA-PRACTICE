public class TypeCasting
{
    public static void main(String [] args)
    {
        

        //type casting is to cast one datatype to another datatype. 
        //It has two types namely.
        
        
        //1.widening casting(automatic).
        int x = 100000;
        float y = x;
        System.out.println("widening casting(automatic) ---> "+y);
        
        //2.narrowing casting(manual).
        
        int a =100;
        byte b =-128;
        Object c = (int)b;
        System.out.println("narrowing casting(manual) ---> "+c + " ---> type ---> " + c.getClass().getName());
    }
}