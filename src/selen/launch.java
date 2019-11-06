package selen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bebom\\eclipse-workspace\\selenium1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		List<WebElement> lstRow=driver.findElements(By.xpath("//div[@class='ui-grid-canvas']"));
					
	for(int i=0;i<lstRow.size();i++)
		{
			WebElement eachRow=lstRow.get(i);
			List<WebElement> lstData=eachRow.findElements(By.xpath("//div[@class='ui-grid-header ng-scope']"));
			
			
			for(int j=0;j<lstData.size();j++)
			{
				WebElement eachData=lstData.get(j);
				String n=eachData.getText();
//					System.out.println(n);
					if(n.equals("Gender"))
					{
						System.out.println(n);
					}
									
			}
			
		
			
		}
				
			
	}

}

//for (WebElement tRow : lstRow) {
//	List<WebElement> lstData=tRow.findElements(By.xpath("//div[@class='ui-grid-row ng-scope']"));
//	for (WebElement tData : lstData) {
//		String n=tData.getText();
//		System.out.println(n);
//	}
//}
