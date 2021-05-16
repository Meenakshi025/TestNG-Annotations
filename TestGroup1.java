import org.testng.annotations.Test;


public class TestGroup1 {
	@Test(priority = 1,groups = {"high"})
	public void DoLogin(){
		System.out.println("Login to the system");
	}
	@Test(priority = 2,groups = {"low"})
	public void FillForm(){
		System.out.println("Filling up the form");
	}
	@Test(priority = 3,groups = {"high"})
    public void SearchFlights(){
		System.out.println("Searching for flights");
	}
	@Test(priority = 4,groups = {"Medium"})
    public void BookTickets(){
		System.out.println("Booking a tickets");
    }

}
