package demo_Guru;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Start 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//launch browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chetan\\Desktop\\selenium jar123\\chromedriver.exe");
		WebDriver w=new ChromeDriver(); 
		Thread.sleep(2000);
		
		//open url
		
		w.get("http://demo.guru99.com/test/newtours/index.php");
		
		//selenium dropdown button
		//1. yahoo
		
		w.findElement(By.className("dropdown-toggle")).click();
		w.findElement(By.linkText("Yahoo")).click();
		Thread.sleep(3000);
		w.navigate().to("http://demo.guru99.com/test/newtours/index.php"); 
		
		//2. file uplode
		  
		w.findElement(By.className("dropdown-toggle")).click();
		w.findElement(By.linkText("File Upload")).click();
		w.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\Chetan\\Documents\\testing report.docx");
		w.findElement(By.id("terms")).click();    //defect  1 file has been successfully uploaded.
		
		w.findElement(By.id("submitbutton")).click();
		Thread.sleep(3000);
		w.navigate().to("http://demo.guru99.com/test/newtours/index.php"); 
		
		//3.flash movie demo
		  
		w.findElement(By.className("dropdown-toggle")).click();
		w.findElement(By.linkText("Flash Movie Demo")).click();
		//play button
		w.findElement(By.name("Play")).click();   //defect
		w.findElement(By.name("Stop")).click();   //defect
		w.findElement(By.name("Zoomin")).click(); //defect
		w.findElement(By.name("Zoomout")).click(); //defect
		
		
		Thread.sleep(3000);
		w.navigate().to("http://demo.guru99.com/test/newtours/index.php");
		
		//4. radio and checkbox demo
		  
		w.findElement(By.className("dropdown-toggle")).click();
        w.findElement(By.linkText("Radio & Checkbox Demo")).click();
        w.findElement(By.id("vfb-7-2")).click();
        w.findElement(By.id("vfb-6-2")).click();
        Thread.sleep(3000);
        w.navigate().to("http://demo.guru99.com/test/newtours/index.php");
        
        //5.table demo
          
		w.findElement(By.className("dropdown-toggle")).click();
		w.findElement(By.linkText("Table Demo")).click();
		Thread.sleep(3000);
		w.navigate().to("http://demo.guru99.com/test/newtours/index.php");
		
		//6. accessing link
		  
		w.findElement(By.className("dropdown-toggle")).click();
		w.findElement(By.linkText("Accessing Link")).click();
		w.findElement(By.xpath("/html/body/a[2]")).click();
		Thread.sleep(3000);
		w.navigate().to("http://demo.guru99.com/test/newtours/index.php");
		 
		
		//7. Ajax demo
		  
		w.findElement(By.className("dropdown-toggle")).click();
		w.findElement(By.linkText("Ajax Demo")).click();
		w.findElement(By.id("yes")).click();
		w.findElement(By.id("buttoncheck")).click();
		String Text= w.findElement(By.xpath("/html/body/div[2]/form/p[3]")).getText();
		System.out.println("the text is: " + Text);
		Thread.sleep(3000);
		w.navigate().to("http://demo.guru99.com/test/newtours/index.php");		
		
		//8.for delete customer form
		  
		w.findElement(By.className("dropdown-toggle")).click();
		w.findElement(By.linkText("Delete Customer Form")).click();   
		w.findElement(By.name("cusid")).sendKeys("suchita");   //customer id
		w.findElement(By.name("submit")).click();   //defect
		
		Alert A1=w.switchTo().alert();  //move focus on alert window
		System.out.println(A1.getText());   //to get alert message from alert window
		Thread.sleep(3000);
		A1.accept();
		
		Alert A2=w.switchTo().alert();  //move focus on  next alert window
		System.out.println(A2.getText());
		Thread.sleep(2000);
		A2.accept();
		w.navigate().back();
		
		//9. login 
		w.findElement(By.className("dropdown-toggle")).click();
		w.findElement(By.linkText("Login")).click();
		w.findElement(By.id("email")).sendKeys("patil@.com");  //email address
		w.findElement(By.id("passwd")).sendKeys("   ");  //password
		w.findElement(By.id("SubmitLogin")).click();  //sign in button
		Thread.sleep(2000);
		String Text1=w.findElement(By.xpath("/html/body/div[2]/div/div")).getText();  //successfully logedin
		System.out.println("the text is: "+Text1);   //get defect
		w.navigate().back(); 
		
		//10. selenium ide
		
		w.findElement(By.className("dropdown-toggle")).click();
		w.findElement(By.linkText("Selenium IDE Test")).click();
		w.findElement(By.name("email")).sendKeys("suchita@.com");  //email id
		w.findElement(By.id("pass")).sendKeys("abc");      //password
		w.findElement(By.id("loginbutton")).click();   //defect
		Thread.sleep(2000);
		w.navigate().to("http://demo.guru99.com/test/newtours/index.php"); 
		
		//11.selenium ide test
		w.findElement(By.className("dropdown-toggle")).click();
		w.findElement(By.linkText("Selenium IDE Test")).click();
		String Text3= w.findElement(By.xpath("//*[@id=\"blueBar\"]/h1/font/center")).getText();
		System.out.println(Text3);
		Thread.sleep(3000);
		w.navigate().to("http://demo.guru99.com/test/newtours/index.php");	
		
		//12. scrollbar demo
		
		w.findElement(By.className("dropdown-toggle")).click();
        w.findElement(By.linkText("Scrollbar Demo")).click();
        w.manage().window().maximize();
        
         WebElement Element=w.findElement(By.linkText("Ethical Hacking"));
       
         //scroll is a javascript method.JavaScriptExicutor provides an interface, to run javascript methods from selenium Script
         
         JavascriptExecutor  js=(JavascriptExecutor) w;
         
         js.executeScript("arguments[0].scrollIntoView();", Element);  //for horizontal scrolling
         
         Element.click();
         
          js.executeScript("window.scrollBy(0,2500)", "");
        System.out.println("page end");
         Thread.sleep(3000);
 		w.navigate().to("http://demo.guru99.com/test/newtours/index.php");  

		
         		
		//13.drag and drop 
		

		w.findElement(By.className("dropdown-toggle")).click();
		w.findElement(By.linkText("Drag and Drop Action")).click();
		
		 w.manage().window().maximize();
		 //scroll down
		 JavascriptExecutor js1=(JavascriptExecutor) w;
		 js1.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		 
		 System.out.println("page end"); 
		 
		
		 WebElement Drag=w.findElement(By.partialLinkText("BANK"));
		 WebElement Drop=w.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		 Actions A=new Actions(w);
	     	A.dragAndDrop(Drag, Drop).build().perform();

			WebElement Drag1=w.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
			WebElement Drop1=w.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
			A.dragAndDrop(Drag1, Drop1).build().perform();

			WebElement Drag2=w.findElement(By.partialLinkText("SALES"));
			WebElement Drop2=w.findElement(By.xpath("//*[@id=\"bank\"]/li"));
			A.dragAndDrop(Drag2, Drop2).build().perform();

			WebElement Drag3=w.findElement(By.xpath("//*[@id=\"credit0\"]/a"));
			WebElement Drop3=w.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
			A.dragAndDrop(Drag3, Drop3).build().perform();
			w.navigate().to("http://demo.guru99.com/test/newtours/index.php");

		//14 date picker demo
		
		w.findElement(By.className("dropdown-toggle")).click();
		w.findElement(By.linkText("Selenium DatePicker Demo")).click();
		w.findElement(By.name("bdaytime")).sendKeys("02051996785567");
		w.findElement(By.xpath("/html/body/form/input[2]")).click();
		w.navigate().to("http://demo.guru99.com/test/newtours/index.php");  
 
		//15. insureance project
		
		w.findElement(By.linkText("Insurance Project")).click();
		
		//register
		
		w.findElement(By.linkText("Register")).click();
		
		Select s=new Select (w.findElement(By.id("user_title")));
		
		s.selectByValue("Miss");
		w.findElement(By.id("user_firstname")).sendKeys("suchita");
		w.findElement(By.id("user_surname")).sendKeys("patil");
		w.findElement(By.id("user_phone")).sendKeys("8605425052"); 
		
		//for year
		 Select s1=new Select (w.findElement(By.id("user_dateofbirth_1i")));
		 
		s1.selectByValue("1995");
		//for month 
		Select s2= new Select (w.findElement(By.id("user_dateofbirth_2i")));
		s2.selectByVisibleText("May");
		
		//for date
		
		Select s3=new Select (w.findElement(By.id("user_dateofbirth_3i")));
		s3.selectByValue("2");
		
		//for radio button
		w.findElement(By.id("licencetype_t")).click();
		
		//for licence period
		Select s4=new Select(w.findElement(By.id("user_licenceperiod")));
		s4.selectByIndex(2);           //0 should not be in double quots
		
		//aoccupation
		Select s5=new Select(w.findElement(By.id("user_occupation_id")));
		s5.selectByIndex(11);
		//address
		w.findElement(By.id("user_address_attributes_street")).sendKeys("maharashtra");
		w.findElement(By.id("user_address_attributes_city")).sendKeys("nasik");
		w.findElement(By.id("user_address_attributes_county")).sendKeys("india");
		w.findElement(By.id("user_address_attributes_postcode")).sendKeys("424206");
		w.findElement(By.id("user_user_detail_attributes_email")).sendKeys("suchita123@gmail.com"); 
		w.findElement(By.id("user_user_detail_attributes_password")).sendKeys("ramram");
		w.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("ramram");
		w.findElement(By.name("submit")).click(); // defect
		Thread.sleep(2000);
		  

		
		//login
	
		w.findElement(By.id("email")).sendKeys("suchita123@gmail.com");
		w.findElement(By.id("password")).sendKeys("ramram");
		w.findElement(By.name("submit")).click();  //defect login with blank textfield
		
		//get title
		System.out.println(w.getTitle());
		
		//logout
		w.findElement(By.xpath("/html/body/div[3]/form/input")).click();
		w.navigate().to("http://demo.guru99.com/test/newtours/index.php"); 

		
		
		
			
			
			
		
		 
		 
		 	
	
		
		
		
		
	
		
				
		
		
		
		
		
		
		
		
		
		
		
         
         
       
        
         
        
		
		
		
		
		
		
		

		
		
 
	}

}
