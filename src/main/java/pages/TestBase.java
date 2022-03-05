package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;		//can't create obj of interface, we have to find a class that implement the obj of interface
	
	public static void initDriver() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.get("https://techfios.com/billing/?ng=login/after/dashboard");
	}
	
	public void takeScreenshot(WebDriver driver) throws IOException {
		TakesScreenshot st =  (TakesScreenshot)driver;		//create reference variable //driver is casting now, this type of variable is called casting
		File sourceFile = st.getScreenshotAs(OutputType.FILE);	//it is a type file, so when creating a variable use File
		String currentDirectory = System.getProperty("user.dir");
		
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String lable = formatter.format(date);
		
		FileUtils.copyFile(sourceFile, new File(currentDirectory + "/screenshot/" + lable +".png"));
	
	
	}
	
}
