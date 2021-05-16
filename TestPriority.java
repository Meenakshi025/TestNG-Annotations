import org.testng.Assert;
import org.testng.annotations.Test;


public class TestPriority {
	
	@Test(priority = 1)
	public void TestLogin(){
		System.out.println("Executing Test one");
		Assert.fail();
	}
	@Test(priority = 2,dependsOnMethods = {"TestLogin"})
	public void TestUserRegistration(){
		System.out.println("Executing Test Two");
	}
	@Test(priority = 3,dependsOnMethods = {"TestLogin"},alwaysRun = true)
	public void TestThree(){
		System.out.println("Executing Test Three");
	}
	@Test(priority = 4,dependsOnMethods = {"TestLogin"},alwaysRun = true)
	public void TestFour(){
		System.out.println("Executing Test Four");
	}

}
