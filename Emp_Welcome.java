package employeeWage;

	public class Emp_Welcome {

		public static void main(String[] args) {
			System.out.println("Welcome to Employee Wage");
			Emp_Welcome obj= new Emp_Welcome();
			obj.Working_Hours();
		}
		
		public void Working_Hours() {
			  final int PART_TIME = 1;
		        final int FULL_TIME = 2;
		        final int WAGE_Per_Hr = 20;
		        final int Max_Working_Days = 20;
		        final int Max_Working_Hrs = 100;

		        int totalWage = 0;
		        int workingHrs = 0;
		        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");
		        for (int day = 1, totalWorkingHrs = 0; day <= Max_Working_Days
		                && totalWorkingHrs < Max_Working_Hrs; day++, totalWorkingHrs += workingHrs)
		        {

		            int empType = (int) (Math.random() * 100) % 3;
		            switch (empType)
		            {
		                case FULL_TIME:
		                    workingHrs = 8;
		                    break;
		                case PART_TIME:
		                    workingHrs = 4;
		                    break;
		                default:
		                    workingHrs = 0;
		                    break;
		            }
		            int wage = workingHrs * WAGE_Per_Hr;
		            totalWage += wage;
		            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, wage, totalWorkingHrs + workingHrs);

		        }
		        System.out.println("Total wage for a month is " + totalWage);
		    }
	}
	


