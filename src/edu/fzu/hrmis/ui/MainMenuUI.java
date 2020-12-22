package edu.fzu.hrmis.ui;

import edu.fzu.hrmis.exceptiom.BlankEntryException;
import edu.fzu.hrmis.utils.SysUtils;

/**
 * 
 * 系统主菜单界面
 * 
 * @author Se7en
 *
 */
public class MainMenuUI implements BaseUI {

	private static String menuInfo;
	
	static {
		StringBuilder sb = new StringBuilder();
		
		sb.append("\nSe7en科技 - Employee Information - Main Menu\n")
		  .append("=====================================================\n\n")
		  .append("1 - Print All Current Records\n")
		  .append("2 – Print All Current Records (formatted)\n")
		  .append("3 – Print Names and Phone Numbers\n")
		  .append("4 – Print Names and Phone Numbers (formatted)\n")
		  .append("5 - Search for specific Record(s)\n")
		  .append("6 - Add New Records\n")
		  .append("7 – Delete Records\n")
		  .append("8 – Update Records\n\n")
		  .append("Q - Quit\n\n")
		  .append("Your Selection:");

		menuInfo = sb.toString();
	}
	
	private static void showMenu() {
		System.out.print(MainMenuUI.menuInfo);
	}
	
	@Override
	public void setup() {

		boolean isContinued = true;
		
		while(isContinued) {
			
			MainMenuUI.showMenu();
			
			try {
				
				String entry = SysUtils.getEntry();
				char choice = entry.toUpperCase().charAt(0);
				
				switch(choice) {
					case '1':
						SysUtils.runUI(UIType.EmpListUI);
						break;
					case '2':
						SysUtils.runUI(UIType.EmpSortedListUI);
						break;
					case '3':
						SysUtils.runUI(UIType.EmpSimpleListUI);
						break;
					case '4':
						SysUtils.runUI(UIType.EmpSimpleSortedListUI);
						break;
					case '5':
						SysUtils.runUI(UIType.EmpSearchUI);
						break;
					case '6':
						SysUtils.runUI(UIType.EmpAddUI);
						break;
					case '7':
						SysUtils.runUI(UIType.EmpDeleteUI);
						break;
					case '8':
				    	 SysUtils.runUI(UIType.EmpUpdateUI);
				    	 break;
					case 'Q':
						isContinued = false;
						break;
					default:
						SysUtils.pause("Invalid code! Press Enter to continue…");
				
				}
				
			}catch(BlankEntryException e) {
				SysUtils.pause("No selection entered. Press Enter to continue…");
			}
				
		}
		
		System.out.println("\nthank you for using HRMIS v1.0! Bye!");
		
	}

}
