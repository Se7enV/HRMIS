package edu.fzu.hrmis.ui;

import java.util.Set;

import edu.fzu.hrmis.dao.EmployeeDao;
import edu.fzu.hrmis.domain.Employee;

/**
 * 
 * 员工信息简略列表界面（排序）
 * 
 * @author Se7en
 *
 */
public class EmpSimpleSortedListUI implements BaseUI {

	@Override
	public void setup() {
		
		EmployeeDao empDao = new EmployeeDao();
		Set<Employee> empSet = empDao.loadSortedEmps();
		
		for(Employee emp:empSet)
			emp.simpleFormattedPrintOut();
		
	}

}
