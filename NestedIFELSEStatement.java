public class NestedIFELSEStatement
{
	public static void main(String[] args)
	{
		int age = 25;
		String name = "bob";

		if(name == "bob") {
			System.out.println("welcome bob");

			if(age>=22) {
				System.out.println("you'r are authenticate to access");
			}
			else {
				System.out.println("need age to atleast 22!");
			}
		} else {
			System.out.println("sorry, bob has access to his .try again!");
		}
	}
}

