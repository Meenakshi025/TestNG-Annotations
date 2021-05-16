import org.testng.annotations.Test;


public class Testgroup2 {
	@Test(groups = {"high"})
	public void ValidateFlightResults(){
		
		System.out.println("Validating flight results");
	}

}
