package edu.fzu.hrmis.ui;

import java.util.List;

import edu.fzu.hrmis.dao.EmployeeDao;
import edu.fzu.hrmis.domain.Employee;
import edu.fzu.hrmis.exceptiom.BlankEntryException;
import edu.fzu.hrmis.exceptiom.IllegalDataException;
import edu.fzu.hrmis.utils.SysUtils;

/**
 * @author Se7en
 *
 */
public class EmpSearchUI implements BaseUI {

	@Override
	public void setup() {

		EmployeeDao empDao = new EmployeeDao();
		List<Employee> empList = empDao.loadEmps();
		
		String enterName = getEmpName();
		if(!checkName(enterName, empList)) {
			System.out.println("Keyword –" + enterName + "- not found\n");
		}

		SysUtils.pause("\nPress Enter to continue...");
		
	}

	private static String getEmpName() {

		String entry = null;

		while (true) {

			System.out.print("Enter keyword:");

			try {
				entry = SysUtils.getEntry().toUpperCase();
				if (!SysUtils.isName(entry)) {
					throw new IllegalDataException();
				}
				break;
			} catch (BlankEntryException e) {
				SysUtils.pause("No last name entered – try again");
			} catch (IllegalDataException e) {
				SysUtils.pause("Last name can contain only alphabetical characters and spaces ");
			}
		}

		return entry;
	}

	private boolean checkName(String name, List<Employee> nameList) {

		boolean had_name = false;

		for (Employee e : nameList) {

			if (e.getLastName().toUpperCase().equals(name)) {
				System.out.println(e.toString());
				had_name = true;
			} else if (e.getFirstName().toUpperCase().equals(name)) {
				System.out.println(e.toString());
				had_name = true;
			} else if (e.getInitial().toUpperCase().equals(name)) {
				System.out.println(e.toString());
				had_name = true;
			}

		}

		return had_name;
	}

}
