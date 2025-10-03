
public class MethodOverloading
{
	int a = 10;
	int b =20;
	public int add(int a,int b)//Method_Overloading
	{
		return a+b;
	}

	public int add(int a,int b, int c)//Method_Overloading
	{
		return a+b+c;
	}
	public float add()
	{
		return a+b;
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		System.out.println(obj.add());
		System.out.println(obj.add(12,43,43));
		System.out.println(obj.add());
	}
}
