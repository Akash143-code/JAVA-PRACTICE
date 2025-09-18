public class Operators1
{
    public static void main(String[]args)
    {
       boolean a = true;
       boolean b = false;
       
       //logical Operators
        System.out.println("#.logical Operators:");
       System.out.println();
       System.out.println("1.and Operator = " +(a && b));
       System.out.println("2.or Operator = " + (a || b));
       System.out.println("3.not Operator = "+(!b));
       System.out.println("4.not Operator = "+(!a));
       System.out.println();
       //bitwise Operators
        System.out.println("#.bitwise Operators:");
       System.out.println("1.bitwise and = "+(a & b));
       System.out.println("2.bitwise or = "+(a | b));
       System.out.println("3. bitwise or = "+(a ^ b));
       int x = 30 ,y =20;
       System.out.println("5.bitwise shift = "+(x << y));
       System.out.println("6.bitwise shift = "+(x >> y));
       System.out.println("7.bitwise shift = "+(x >>> y));
       System.out.println();
       //ternary Operators
       System.out.println("#.ternary Operators:");
       String check =(x > y) ?  "True" : "False";
       System.out.println("1.ternary operator = "+check);
      
    }
}