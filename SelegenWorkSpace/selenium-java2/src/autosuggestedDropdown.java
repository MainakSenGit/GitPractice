import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class autosuggestedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Work Oracle Eclipse WS\\SelegenWorkSpace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}

		// checkbox isDisplayed, Enabled, selected or not
		System.out.println(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isEnabled());
		System.out.println(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());

		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());

		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='StudentDiscount']")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

		Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), 6);

	}

}
