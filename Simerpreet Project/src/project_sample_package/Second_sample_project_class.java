package project_sample_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Second_sample_project_class {
	
	@BeforeClass
    void setUpClass() {
        System.setProperty("webdriver.Edge.driver", "C:\\Users\\kahlo\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        // BeforeClass action to link the driver
    }
    @Test
    public void imagess() throws InterruptedException {
        EdgeDriver driver =new EdgeDriver();

        driver.get("https://demoqa.com/");
        List<WebElement> listImages = driver.findElements(By.tagName("img"));
        //creating the list for getting the number of elements
        int figures = 0; //variable to count the images
        for (WebElement image : listImages) { //loop
            if ( image.isDisplayed()) { //condition for images
                figures++;    //increment
            }
        }
        System.out.println("No. of total displayed images: " + figures);
        driver.close();
    }
    @Test
    //this test is same as above just a tag is changed i.e. for buttons
    public void buttons() throws InterruptedException {
        EdgeDriver driver =new EdgeDriver();

        driver.get("https://demoqa.com/");
        List<WebElement> listButtons = driver.findElements(By.tagName("button"));

        int counts = 0;
        for (WebElement button : listButtons) {
            if(button.getText().equals("buttonName")) {
                counts++;
            }
        }
        System.out.println("No. of total displyed buttons: " + counts);

        driver.close();
    }



}
