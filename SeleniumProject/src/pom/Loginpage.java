package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {

	public String url = "http://orangehrm.qedgetech.com";
	public String u = "Admin";
	public String p = "Qedge123!@#";
	
	@FindBy(id = "txtUsername")
	WebElement username;
	
	@FindBy(id = "txtPassword")
	WebElement password;
	
	@FindBy(id = "btnLogin")
	WebElement login;
	
	public void orgLogin(){
		username.sendKeys(u);
		password.sendKeys(p);
		login.click();
	}
	
}	
