package employeewages_builder;
import java.util.Random;
public class EmploeewagesBuilder {






    public static void main(String[] args) {
    	 
    	        System.out.println("Welcome To Employee Wage Computation Program");
    	        
    	        int IS_FULLTIME = 1;
    	        int IS_PARTTIME = 2;
    	        int Emp_Rate_PerHr = 20;
    	        
    	        int empHrs = 0;
    	        int empWage = 0;
    	        
    	        Random random = new Random();
    	        int empCheck = random.nextInt(3);
    	        if (empCheck == IS_FULLTIME)
    	            empHrs = 8;
    	        else if (empCheck == IS_PARTTIME)
    	            empHrs = 4;
    	        else
    	            empHrs = 0;
    	        
    	        empWage = Emp_Rate_PerHr * empHrs;
    	        System.out.println("The daily wage of an employee is : " + empWage);
    	    }
    	}