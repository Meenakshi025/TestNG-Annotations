import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestNGParameter {
	
	@Test(dataProvider = "getData")
	public void TestFormfill(String Username,String Password,Integer Age){
		System.out.println(Username + " " + Password + " " + Age);
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[2][3];
		
		data[0][0] = "meenakshi.patil04@gmail.com";
		data[0][1] = "Meenu@676";
		data[0][2] = 20;
		
		data[1][0] = "meenifsss@gmail.com";
		data[1][1] = "Meenu@676";
		data[1][2] = 25;
		
		return data;
	}

}
