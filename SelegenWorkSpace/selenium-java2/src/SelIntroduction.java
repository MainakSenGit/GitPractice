import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoking Browser
		//Chrome - ChromeDriver ->methods
		/*chromedriver.exe -> Thrid party library. any code written at first 
		that can be interprited by this ".exe" file and after that action will go on to the chrome browser.
		 for firefox driver name is gecko driver and for edge driver name is edge driver*/
		System.setProperty("webdriver.chrome.driver", "C:\\Work Oracle Eclipse WS\\SelegenWorkSpace\\chromedriver.exe");
		
		//WebDriver method + class method
			//ChromeDriver driver=new ChromeDriver();
		//Only use WebDriver method
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com"); //open the URL
		System.out.println(driver.getTitle());  //get the page title
		System.out.println(driver.getCurrentUrl()); //get the current URL
		//driver.close(); //close the current window
		//driver.quit(); it will close all associated windows.
		
	}

}
