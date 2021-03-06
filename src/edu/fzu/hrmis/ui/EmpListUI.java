package edu.fzu.hrmis.ui;

import java.util.List;

import edu.fzu.hrmis.dao.EmployeeDao;
import edu.fzu.hrmis.domain.Employee;
import edu.fzu.hrmis.utils.SysUtils;

/**
 * 
 * 员工列表界面
 * 
 * @author Se7en
 *
 */
public class EmpListUI implements BaseUI {

	@Override
	public void setup() {

		EmployeeDao empDao = new EmployeeDao();
		List<Employee> empList = empDao.loadEmps();
		
		for(Employee emp:empList)
			emp.printOut();
		
		SysUtils.pause("\nPress Enter to continue... ");
		
	}

}
