import java.util.*;

public class ElseIFStatement
{
	public static void main(String[] args)
	{
		int age = 25;
		String name = "bob";
		System.out.println("Please enter code to access --->");
		Scanner s = new Scanner(System.in);
		int code = s.nextInt();



		if(name.equals("bob"))
		{
			System.out.println("welcome bob");

			if(code == 2468910) {

				System.out.println("you can access to this domain,bob");
			}
			else {
				System.out.println("sorry,wrong code. try again:(");
			}

		}
		else
		{
			System.out.println("sorry, bob has access to his .try again!");
		}
	}
}

