package employeewages_builder;
import java.util.Random;
public class EmploeewagesBuilder {
	
	    public static final int IS_FULLTIME = 1;
	    public static final int IS_PARTTIME = 2;
	    public static final int Emp_Rate_PerHr = 20;
	    public static final int NO_WORKINGDAYS = 20;

	    public static void main(String[] args) {
	        System.out.println("Welcome To Employee Wage Computation Program");
	       
	        int empHrs = 0;
	        int empWage = 0;
	        int totalEmpWage = 0;
	       
	        for (int day = 0; day < NO_WORKINGDAYS; day++) {
	            Random random = new Random();
	            int empCheck = random.nextInt(3);
	            switch (empCheck) {
	                case IS_FULLTIME: 
	                    empHrs = 8;
	                    break;
	                case IS_PARTTIME: 
	                    empHrs = 4;
	                    break;
	                default: 
	                    empHrs = 0;
	            }
	            
	            empWage = Emp_Rate_PerHr * empHrs;
	            totalEmpWage += empWage;
	            System.out.println("The daily wage of an employee is : " + empWage);
	        }
	        System.out.println("The total wage of an employee in a month is : " + totalEmpWage);
	    }
	}