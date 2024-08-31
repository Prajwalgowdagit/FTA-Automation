package Assignments;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment12 {
	public static void main(String[] args) { 
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.get("C:\\menu.html"); 
		WebElement mtr =driver.findElement(By.id("mtr")); 
		 
		Set<String> store= new HashSet<>(); 
		Select s1= new Select(mtr); 
		List<WebElement> options = s1.getOptions(); 
		for (WebElement ele1 : options) { 
		String text = ele1.getText(); 
		store.add(text); 
		System.out.println(text); 
		} 
		for (int i = 0; i < options.size(); i++) { 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the input : "); 
		String input=sc.next(); 
		if (store.contains(input)) { 
		System.out.println("Dish is present"); 
		}else { 
		System.out.println("Dish is not present"); 
		sc.close();		} 
		} 
		}
}
