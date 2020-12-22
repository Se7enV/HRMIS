package edu.fzu.hrmis;

import edu.fzu.hrmis.exceptiom.HRMISException;
import edu.fzu.hrmis.ui.UIType;
import edu.fzu.hrmis.utils.SysUtils;

/**
 * 初始系统功加载入口
 * @author Se7en
 *
 */
public class SysLoader {

	public static void main(String[] args) {

		try {
			SysUtils.checkResource();
			SysUtils.checkUser();
			SysUtils.runUI(UIType.EmpLoginUI);
			SysUtils.runUI(UIType.MainMenuUI);
		}catch(HRMISException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
