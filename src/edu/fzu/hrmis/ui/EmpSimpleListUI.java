package edu.fzu.hrmis.ui;

import java.util.List;

import edu.fzu.hrmis.dao.EmployeeDao;
import edu.fzu.hrmis.domain.Employee;
import edu.fzu.hrmis.utils.SysUtils;

/**
 * 
 * Ա����Ϣ�����б����
 * 
 * @author Se7en
 *
 */
public class EmpSimpleListUI implements BaseUI {

	@Override
	public void setup() {
		EmployeeDao empDao = new EmployeeDao();
		List<Employee> empList = empDao.loadEmps();
		
		for(Employee emp:empList)
			emp.simplePrintOut();
		
		SysUtils.pause("\nPress Enter to continue... ");
		
	}

}
