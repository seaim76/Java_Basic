package classes;
import java.lang.*;
import interfaces.*;

public class Stationary implements IShop, IEmployee{
	
private Shop stationary[] = new Shop[50];
	private Employee employees[] = new Employee[150];

	public boolean insertStationary(Shop r){
		boolean flag = false;
		for(int i=0; i<stationary.length; i++){
			if(stationary[i] == null){
				stationary[i] = r;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public boolean removeStationary(Shop r){
		boolean flag = false;
		for(int i=0; i<stationary.length; i++){
			if(stationary[i] == r){
				stationary[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public Shop searchStationary(String rid){

		Shop r = null;
		
		for(int i=0; i<stationary.length; i++){
			if(stationary[i] != null){
				if(stationary[i].getRid().equals(rid)){
					r = stationary[i];
					break;
				}
			}
		}
		return r;
	}

	public void showAllStationary(){
		for(int i = 0; i<stationary.length; i++){
			if(stationary[i]!=null){
				System.out.println("---------------------------------------------");
				System.out.println("Stationary ID : "+stationary[i].getRid());
				System.out.println("Stationary Name : "+stationary[i].getName());
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
				stationary[i].showAllProductItems();
				System.out.println("---------------------------------------------");
			}
		}
	}

	public boolean insertEmployee(Employee e){
		boolean flag = false;

		for(int i=0; i<employees.length; i++){
			if(employees[i]==null){
				employees[i]=e;
				flag =  true;
				break;
			}
			else{flag = false;}
		}
		return flag;
	}

	public boolean removeEmployee(Employee e){
		boolean flag = false;

		for(int i=0; i<employees.length ; i++){
			if(employees[i]==e){
				employees[i]=null;
				flag =  true;
				break;
			}
			else{flag = false;}
		}
		return flag;
	}

	public Employee searchEmployee(String empId){
		Employee e = null;
		for(int i=0; i<employees.length ; i++){
			if(employees[i] != null){
				if(employees[i].getEmpId().equals(empId)){
					e=employees[i];
					break;
				}
			}
		}
		return e;
	}

	public void showAllEmployees(){
		for(int i = 0; i<employees.length; i++){
			if(employees[i]!=null){
				System.out.println("\n---------------------------------------------------\n");
				System.out.println("Employee ID : "+employees[i].getEmpId());
				System.out.println("Employee Name : "+employees[i].getName());
				System.out.println("Employee Salary : "+employees[i].getSalary());
				System.out.println("\n---------------------------------------------------\n");
			}
		}
	}


}