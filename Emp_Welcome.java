package employeeWage;

	public class Emp_Welcome {

		public static void main(String[] args) {
			System.out.println("Welcome to Employee Wage");
			Emp_Welcome obj= new Emp_Welcome();
			obj.Switch_case();
		}
		
		public void Switch_case() {
			  final int PART_TIME = 1;
		        final int FULL_TIME = 2;
		        final int Wage_Per_Hr = 20;
		        final int Working_Days = 20;

		        int totalWage = 0;
		        for(int day=1;day<=Working_Days;day++)
		        {

		            int empType = (int) (Math.random() * 100) % 3;
		            int workingHours = 0;
		            switch (empType)
		            {
		                case FULL_TIME:
		                    workingHours = 8;
		                    break;

		                case PART_TIME:
		                    workingHours = 4;
		                    break;

		                default:
		            }

		            int wage = workingHours * Wage_Per_Hr;
		            System.out.println("Day " + day + " Wage is : " + wage);
		            totalWage += wage;

		        }
		           System.out.println("Total wage for a month is " + totalWage);
		    }
		
	}


