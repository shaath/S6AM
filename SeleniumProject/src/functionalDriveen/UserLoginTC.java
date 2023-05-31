package functionalDriveen;

import java.io.IOException;

public class UserLoginTC {

	public static void main(String[] args) throws InterruptedException, IOException {
		String res;
		BusinessMethods bm = new BusinessMethods();
		
		res = bm.orgLaunch("firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+ res);
		
		res = bm.orgLogin("AAAASivaSankar", "Test@5432167890");
		System.out.println("User Login "+ res);

		res = bm.orgLogout();
		System.out.println("Application Logout "+ res);
		
		bm.orgClose();
		System.out.println("Application closed successfully");

	}

}
