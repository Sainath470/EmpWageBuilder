public class EmpWageBuilder
{
	public static void main(String args[])
	{
		System.out.println("Welcome to the Employee Wage Computation");
			//constants
			int FULL_TIME=1;
			//Computation
				double empCheck=Math.floor(Math.random()*10)%2;
				if(empCheck==FULL_TIME)
				{
					System.out.println("Employee is present");
				}
					else
					System.out.println("EMployee is Absent");

	}
}
