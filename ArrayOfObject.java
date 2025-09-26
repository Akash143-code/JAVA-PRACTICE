class demo
{
	String employee;
	int salary;
	int rank;

}

public class ArrayOfObject
{
	public static void main(String[]args)
	{
		demo E1 = new demo();
		E1.employee = "kiran";
		E1.salary = 78000;
		E1.rank = 5;

		demo E2 = new demo();
		E2.employee = "ramesh";
		E2.salary = 78000;
		E2.rank = 5;

		demo E3 = new demo();
		E3.employee = "kiran";
		E3.salary = 78000;
		E3.rank = 5;

		demo emp_id[] =new demo[3];
		emp_id[0]=E1;
		emp_id[1]=E2;
		emp_id[2]=E3;

		for(int i =0; i<emp_id.length; i++)
		{
			System.out.println("Employee Name:"+emp_id[i].employee + "  Salary:"+emp_id[i].salary+"  Rank:"+emp_id[i].rank);
		}
	}
}