package employeeWage;

	public class Emp_Welcome {

		public static void main(String[] args) {
			System.out.println("Welcome to Employee Wage");
			Emp_Welcome obj= new Emp_Welcome();
			obj.Present_Absent();
		}
		
		public void Present_Absent() {
			final int FULL_TIME = 1;
		    int empType = (int) (Math.random() * 100) % 2;
		        if (empType == FULL_TIME)
		    {
		        System.out.println("Employee is Present");
		    } else
		    {
		        System.out.println("Employee is Absent");
		    }
	}
}

