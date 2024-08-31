package Assignments;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class AlphabeticalOrder {
		//List in alphabatical order 
		public static void main(String[] args) { 
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.get("C:\\"); 
		WebElement mtr =driver.findElement(By.id("mtr")); 
		 
		Select s1 = new Select(mtr); 
		ArrayList<String> opt = new ArrayList<>(); 
		for (WebElement webElement : s1.getOptions()) { 
		String text = webElement.getText(); 
		opt.add(text); 
		} 
		Collections.sort(opt); 
		System.out.println(opt); 
		driver.quit(); 
		 
		} 
}
