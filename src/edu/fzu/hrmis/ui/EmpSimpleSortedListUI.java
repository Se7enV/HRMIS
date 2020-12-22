package edu.fzu.hrmis.ui;

import java.util.Set;

import edu.fzu.hrmis.dao.EmployeeDao;
import edu.fzu.hrmis.domain.Employee;

/**
 * 
 * Ա����Ϣ�����б���棨����
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
