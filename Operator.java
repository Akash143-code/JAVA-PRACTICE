public class Operator
{
    public static void main(String [] args)
    {
        int a =20;  //local variable
        int b =5;  //local variable
        
        //Arithmetic operators
        System.out.println("#.Arithmetic Operators:");
        System.out.println("1.addition = "+(a+b));
        System.out.println("2.subtraction = "+(a-b));
        System.out.println("3.multiplication = "+(a*b));
        System.out.println("4.division = "+(a/b));
        System.out.println("5.modular division = "+(a%b));
        System.out.println();
        //relational operators
        System.out.println();
        System.out.println("#.Relational Operators:");
        System.out.println("1.equalant operators = "+(a==b));
        System.out.println("2.not equalant operators = "+(a!=b));
        System.out.println("3.lesser than operators = "+(a<b));
        System.out.println("4.greater than operators = "+(a>b));
        System.out.println("5.lesser than equal to operators = "+(a<=b));
        System.out.println("6.lesser than equal to operators = "+(a>=b));
        System.out.println();
        //unary Operators
        System.out.println("#.unary Operators:");
        System.out.println();
        System.out.println("1.post increment = "+ (++a));
        System.out.println("2.pre increment = "+(a++));
        System.out.println("3.pre decrement = "+ (a--));
        System.out.println("4.post decrement = "+(--a));
        System.out.println();
        //assignment operators
        System.out.println();
        System.out.println("#.Assignment Operators:");
        System.out.println("1.Addition Assign = "+(a+=a));
        System.out.println("2.subtraction Assign = "+(a-=b));
        System.out.println("3.multiplication Assign = "+(a*=b));
        System.out.println("5.division Assign = "+(a/=b));
        System.out.println("4.modular division Assign = "+(a%=b));
        System.out.println();
        
    }
}