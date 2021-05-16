import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestNG_parametrize_Excel {
public static ExcelReader excel = null;
	
	@Test(dataProvider = "getData")
	public void Testdata(Hashtable<String,String>data){
		//System.out.println(Username + " " + Password + " " + Is_Correct);
		System.out.println(data.get("Username")+"......"+data.get("Password")+"......"+data.get("Is_Correct")+"......"+data.get("Age")+"......"+data.get("Gender"));;
	}
	
	@DataProvider
	public Object[][] getData(){
		
    if (excel == null){
    	excel = new ExcelReader("D:\\Screenshot\\Excel_Reading.xlsx");
    }
		String sheetName = "TestNG";
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);
		
		 Object[][] data = new Object[rows-1][1];
		 
		 Hashtable<String,String> table = null;
		 
		 for(int rowNum = 2; rowNum<=rows; rowNum++)
		 {
			 table = new Hashtable<String,String>();
			 
			 for(int colNum = 0; colNum<cols; colNum++)
			 {
				 //data[rowNum-2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
				 
				 table.put(excel.getCellData(sheetName, colNum, 1),excel.getCellData(sheetName, colNum, rowNum));
				 
				 data[rowNum-2][0] = table;
			 }
			 
		 }
		return data;
		
	}


}
