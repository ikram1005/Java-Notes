package javaInterview;
import java.util.*;
public class Main {
	 public static void main(String[] arg){
	        Scanner sc=new Scanner(System.in);
	        while(sc.hasNextLine()){
	             int n=sc.nextInt();
	             int[] arr=new int[n];
	             for(int i=0;i<n;i++){
	                arr[i]=sc.nextInt();
	             }
	           side(n,arr);
	        }
	       
	    }
	    public static void side(int n,int[] arr){
	        // System.out.println(Arrays.toString(arr));
	        Stack<Integer>side=new Stack<>();
	        int eTruck=1;
	        
	        for(int i=0;i<n;i++){
	            int truck=arr[i];
	            while(!side.isEmpty()&&side.peek()==eTruck){
	                eTruck++;
	                side.pop();
	            }
	            if(truck==eTruck){
	                eTruck++;
	            }else{
	                side.push(truck);
	            }
	        }
	        while(!side.empty()&&side.peek()==eTruck){
	            eTruck++;
	            side.pop();
	        }
	        
	        if(eTruck==n+1&&eTruck!=1){
	            System.out.println("yes");
	        }
	        else if(eTruck==1){
	        }
	        else{
	            System.out.println("no");
	        }
	    }
}

class employee{
	  // complete the class as mentioned in the problem statement
	     int employee_id;
	     String name;
	     int salary;
	     boolean stock_options;
	     int vesting_period;
	     
	     int employeeNumber() {
	    //  - It returns the employee ID
	         return employee_id;
	     }
	     String name() {
	    //  - It returns the name of the employee
	         return name;
	     }
	     int salary(){
	    //  - It returns the salary of the employee
	         return salary;
	     }
	     
	     boolean stock_options(){
	    //  - It returns true if the employee gets stock options else returns false
	         if(stock_options){
	             return true;
	         }else{
	             return false;
	         }
	     }
	     
	     int vesting_period(){
	    //  - It returns the vesting period of the employee
	    	 if(stock_options()==true){
	             return vesting_period;
	            }else{
	                return 0;
	            }
	     }
	         
	// ** If the stock options are false for an employee, the vesting period is considered as 0
}
class company{
	  // complete the class as mentioned in the problem statement
	  int size;
	  employee[] arr;
	  
	  void sortSalary(employee[] employees){
	// - This function sort the array based on the salary of the employees in increasing order
	      Arrays.sort(employees,new Comparator<employee>(){
	    	  
	    	  public int compare(employee e1,employee e2){
	              return e1.salary-e2.salary;
	          }
	      });
	  }
	void sortEmployeeId(employee[] employees){
	// - This function sorts the array based on the employee IDs in increasing order
	     Arrays.sort(employees,new Comparator<employee>(){
	          public int compare(employee e1,employee e2){
	              return e1.employee_id-e2.employee_id;
	          }
	      });
	}
	void sortVestingPeriod (employee[] employees){
	// - This function sorts the array based on the vesting period for each employee in decreasing order. - Someone with a higher vesting period comes first compared to one with a smaller vesting period
	    Arrays.sort(employees,new Comparator<employee>(){
	          public int compare(employee e1,employee e2){
	              return e1.vesting_period-e2.vesting_period;
	          }
	      });
	}
	void stockOrNot(int id){
	// - This function checks wether a particular employee has been given stock or not
	// - The employee ID is passed as parameter
	// - If the stock is granted to the employee, the function prints the following
		 employee e=new employee();
		 
		    if (id==e.employee_id) {
		        if (e.stock_options()) {
		            System.out.println("Stock granted to " + e.name());
		        } else {
		            System.out.println("Stock not granted to " + e.name());
		        }
		    } else {
		        System.out.println("Invalid Employee ID");
		    }
	    
	}

//	`Stock not Granted to " + employee_name`
//	- If the stock is not granted to the employee, the function prints the following
//	Stock not Granted to " + employee_name`
//	- Else the function prints the following
//	*Invalid Employee ID`
	int size(){
		return size;
	// - This function returns the number of employees in the company
	    
	}
}

