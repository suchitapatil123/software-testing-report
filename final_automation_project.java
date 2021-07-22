package demo_Guru;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class final_automation_project {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chetan\\Desktop\\selenium jar123\\chromedriver.exe");
		WebDriver w=new ChromeDriver(); 
		Thread.sleep(2000);
		
		w.get("http://demo.guru99.com/test/newtours/index.php");
		
		

		//16 agile project
		
		w.findElement(By.linkText("Agile Project")).click();
		w.findElement(By.name("uid")).sendKeys("1303");  //user id
		w.findElement(By.name("password")).sendKeys("Guru99");  //password
		w.findElement(By.name("btnLogin")).click();
		
		w.findElement(By.linkText("Log out")).click();      //u have successfully logout
		
		Alert A3=w.switchTo().alert();  //move focus on  next alert window
		System.out.println(A3.getText());
		Thread.sleep(2000);
		A3.accept();
		w.navigate().back();  
		
		//16. bank project
		
		w.findElement(By.linkText("Bank Project")).click();
		w.findElement(By.linkText("here")).click();
		w.findElement(By.name("emailid")).sendKeys("suchitacp1996@gmail.com");
		w.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);

		//for  screenshot
		
		TakesScreenshot t = (TakesScreenshot) w;
		File shot=t.getScreenshotAs(OutputType.FILE);
		Files.copy(shot, new File ("D:\\screenshot pic\\suchi1.png"));
		System.out.println("screenshot is done");
		 w.navigate().to("http://demo.guru99.com/V1/index.php");
		 w.findElement(By.name("uid")).sendKeys("mngr336127");
		 w.findElement(By.name("password")).sendKeys("YsAnyza");
		 w.findElement(By.name("btnLogin")).click();
		 Thread.sleep(3000);
	    w.findElement(By.linkText("Log out")).click();
		Alert A4=w.switchTo().alert();  //move focus on  next alert window
		System.out.println(A4.getText());
		Thread.sleep(2000);
		A4.accept();
		w.navigate().to("http://demo.guru99.com/test/newtours/index.php");  
	
	   //17.Telicom project
		
		w.findElement(By.linkText("Telecom Project")).click();
		w.findElement(By.linkText("Add Customer")).click();
		w.findElement(By.xpath("//label[contains(text(),'Done')]")).click();
		w.findElement(By.id("fname")).sendKeys("suchita");
		w.findElement(By.id("lname")).sendKeys("patil");
		w.findElement(By.id("email")).sendKeys("suchita123@gmail.com");
		w.findElement(By.name("addr")).sendKeys("nashik");
		w.findElement(By.id("telephoneno")).sendKeys("9421567793");   //defect add customer with same number nd same  
		w.findElement(By.name("submit")).click();
		w.findElement(By.className("button")).click();  
		
		w.navigate().to("http://demo.guru99.com/test/newtours/index.php");  
		
		//18.payment gateway
		//to check functionality of buy button
		w.findElement(By.linkText("Payment Gateway Project")).click();
		Select q= new Select (w.findElement(By.name("quantity")));
		q.selectByValue("4");
		w.findElement(By.xpath("//body/section[@id='three']/div[1]/form[1]/div[1]/div[8]/ul[1]/li[1]/input[1]")).click();
		//to check functionality of pay button
		w.findElement(By.id("card_nmuber")).sendKeys("3456765478678965");
		Select s6= new Select (w.findElement(By.id("month")));
		s6.selectByValue("8");
		Select s7=new Select(w.findElement(By.xpath("//select[@id='year']")));
		s7.selectByValue("2019");                              //defect with expired date payment is succesful
		w.findElement(By.id("cvv_code")).sendKeys("234");
		w.findElement(By.name("submit")).click();
		//payement successful
		String p= w.findElement(By.xpath("//h2[contains(text(),'Payment successfull!')]")).getText();
		System.out.println(p);
		Thread.sleep(2000);
		w.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		w.navigate().to("http://demo.guru99.com/test/newtours/index.php");
		
		//19 to check functionality of submit button of flight
		
		w.findElement(By.name("userName")).sendKeys("   ");
		w.findElement(By.name("password")).sendKeys("123");
		w.findElement(By.name("submit")).click();                   //defect
		Thread.sleep(2000);
		//get title
		System.out.println(w.getTitle());
		//get text
		String l= w.findElement(By.xpath("//tbody//tr//td//h3")).getText();
		System.out.println(l);
		//sign off
		w.findElement(By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]")).click();
		
		

	}

}
