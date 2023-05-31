package functionalDriveen;

import java.io.IOException;

public class TestSuiteExe {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		String res;
		BusinessMethods bm = new BusinessMethods();
		//Login
		res = bm.orgLaunch("firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+ res);
		
		res = bm.orgLogin("Admin", "Qedge123!@#");
		System.out.println("Application Login "+ res);

		res = bm.orgLogout();
		System.out.println("Application Logout "+ res);
		
		bm.orgClose();
		System.out.println("Application closed successfully");
		
		//Employee Registration
		res = bm.orgLaunch("firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+ res);
		
		res = bm.orgLogin("Admin", "Qedge123!@#");
		System.out.println("Application Login "+ res);
		
		res = bm.orgEmpReg("Siva", "Sankar", "SS23321");
		System.out.println("Employee Registration " + res);

		res = bm.orgLogout();
		System.out.println("Application Logout "+ res);
		
		bm.orgClose();
		System.out.println("Application closed successfully");
		
		//User Registration
		res = bm.orgLaunch("firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+ res);
		
		res = bm.orgLogin("Admin", "Qedge123!@#");
		System.out.println("Application Login "+ res);
		
		res = bm.orgUserReg("Siva Sankar", "AAAGGSivaSankar123", "Test@5432167890");
		System.out.println("User Registration " + res);

		res = bm.orgLogout();
		System.out.println("Application Logout "+ res);
		
		bm.orgClose();
		System.out.println("Application closed successfully");
		
		//User Login
		res = bm.orgLaunch("firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+ res);
		
		res = bm.orgLogin("AAAGGSivaSankar123", "Test@5432167890");
		System.out.println("User Login "+ res);

		res = bm.orgLogout();
		System.out.println("Application Logout "+ res);
		
		bm.orgClose();
		System.out.println("Application closed successfully");
		

	}

}
