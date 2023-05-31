package functionalDriveen;

import java.io.IOException;

public class EmpRegTC {

	public static void main(String[] args) throws InterruptedException, IOException {
		String res;
		BusinessMethods bm = new BusinessMethods();
		
		res = bm.orgLaunch("firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+ res);
		
		res = bm.orgLogin("Admin", "Qedge123!@#");
		System.out.println("Application Login "+ res);
		
		res = bm.orgEmpReg("Siva", "Sankar", "SS231");
		System.out.println("Employee Registration " + res);

		res = bm.orgLogout();
		System.out.println("Application Logout "+ res);
		
		bm.orgClose();
		System.out.println("Application closed successfully");

	}

}
