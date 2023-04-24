package tyss.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebsiteURLTest {
	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		String url=System.getProperty("url");
		driver.get(url);
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println("*************************");
		String current=driver.getCurrentUrl();
		System.out.println(current);
		driver.close();
	}

}
