package interfaces;

import classes.*;

public interface IEmployee
{

	boolean insertEmployee(Employee e);

	boolean removeEmployee(Employee e);

	Employee searchEmployee(String empId);

	void showAllEmployees();
}

