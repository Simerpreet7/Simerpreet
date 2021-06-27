package project_sample_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
    @Test
public class First_sample_project_class {
    	// location for WebDriver
    	String driverLocation = "C:\\Users\\kahlo\\Downloads\\edgedriver_win64\\msedgedriver.exe";
    	static WebDriver driver;

    	// Elements that will run before test
    	@BeforeTest
    	public void getDriver() {
    		
    		// set browser as Edge
    		System.setProperty("webdriver.edge.driver", driverLocation);
    		// Edge driver object
    		driver = new EdgeDriver();
    		
    		// maximizing window
    		driver.manage().window().maximize();
    		
    		// navigate to url
    		driver.get("https://demoqa.com/");
    		System.out.println("testing for Class 1...");
    	}

    	// all tests 
    	@Test
    	public void TestMethod() {
    		String actualtitle = driver.getTitle();
    		String expectedTitle = "ToolsQA";

    		// Testing title
    		Assert.assertEquals(actualtitle, expectedTitle);
    		System.out.println("Title Assertion Passed");

    		// finding logo.
    		
    		try {
    			boolean findLogo = driver.findElement(By.className("logo")).isDisplayed();
    			Assert.assertEquals(true, findLogo);
    			System.out.println("Logo present");
    		}catch(Exception e) {
    			System.out.println("Logo Not Present!!");
    		}

    		System.out.println("All Test Case Pass");

    	}

    	// operation after test
    	@AfterTest
    	public void closeDriver() {
    		driver.close();
    	}
    }
