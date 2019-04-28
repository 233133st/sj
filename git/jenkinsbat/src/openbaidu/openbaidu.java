package openbaidu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class openbaidu {
	public static WebDriver driver;
	public static String url;
	
	@Test
	public void open() {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		driver=new ChromeDriver();
		//¶¨ÒåÍøÖ·
		url="https://www.baidu.com/";
		driver.get(url);
	}
}
