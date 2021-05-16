import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class test_02 {
	
	@Test
	public void TestLogin(){
		System.out.println("Testing Login Screen");
	}
	
	@BeforeTest
	public void TestFormFilling(){
		System.out.println("Testing Registration Form");
	}
	@BeforeMethod
	public void OpenedBrowser(){
		System.out.println("Opening Browser");
	}
	@AfterMethod
	public void ClosedBrowser(){
		System.out.println("Closing Browser");
	}
	@BeforeTest
	public void OpenedDBConnection(){
		System.out.println("Create DB Connection");
	}
	@AfterTest
	public void ClosedDBConnection(){
		System.out.println("Closing DB Connection");
	}
	@BeforeSuite
	public void RunSeleniumServer(){
		System.out.println("Opening Selenium Server");
	}
	@AfterSuite
	public void StopSeleniuServer(){
		System.out.println("Closing Selenium Server");
	}



}
