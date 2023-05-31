package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHomePage {

	@FindBy(linkText = "Admin")
	WebElement admin;
	
	@FindBy(linkText = "PIM")
	WebElement pim;
	
	@FindBy(linkText = "Leave")
	WebElement leave;
	
	@FindBy(linkText = "Time")
	WebElement time;
	
	@FindBy(linkText = "Recruitment")
	WebElement recruitment;
	
	@FindBy(linkText = "My Info")
	WebElement myinfo;
	
	@FindBy(linkText = "Performance")
	WebElement performance;
	
	@FindBy(linkText = "Dashboard")
	WebElement dashboard;
	
	@FindBy(linkText = "Directory")
	WebElement directory;
	
	@FindBy(linkText = "Maintenance")
	WebElement maintenance;
	
	@FindBy(linkText = "Buzz")
	WebElement buzz;
	
	@FindBy(partialLinkText = "Welcome")
	WebElement welcome;
	
	@FindBy(linkText = "About")
	WebElement about;
	
	@FindBy(linkText = "Support")
	WebElement support;
	
	@FindBy(linkText = "Change Password")
	WebElement cp;
	
	@FindBy(linkText = "Logout")
	WebElement logout;
	
	public void adminClick(){
		admin.click();
	}
	
	public void pimClick(){
		pim.click();
	}
	
	public void leaveClick(){
		leave.click();
	}
	
	public void timeClick(){
		time.click();
	}
	
	public void recruitmentClick(){
		recruitment.click();
	}
	
	public void myinfoClick(){
		myinfo.click();
	}
	
	public void performanceClick(){
		performance.click();
	}
	
	public void dashboardClick(){
		dashboard.click();
	}
	
	public void directoryClick(){
		directory.click();
	}
	
	public void maintenanceClick(){
		maintenance.click();
	}
	
	public void buzzClick(){
		buzz.click();
	}
	
	public void welocmeClick(){
		welcome.click();
	}
	
	public void supportClick(){
		support.click();
	}
	public void cpClick(){
		cp.click();
	}
	
	public void logoutClick(){
		logout.click();
	}
}
