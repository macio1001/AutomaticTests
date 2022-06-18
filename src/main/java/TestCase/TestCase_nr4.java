package TestCase;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_nr4 {

    //####################################################################################
    //##                                                                                ##
    //##                              Test case number 4                                ##
    //##                       https://automationintesting.online/                      ##
    //##                              Reservation rooms                                 ##
    //##                                                                                ##
    //####################################################################################

    public WebDriver getDriver(){
        WebDriver webDriver=new ChromeDriver();

        webDriver.manage().window().maximize();

        webDriver.navigate().to("https://automationintesting.online/");

        return webDriver;
    }

    @Test
    public void findElement(){
        WebDriver webDriver=getDriver();

        WebElement logoOnWeb=webDriver.findElement(By.xpath("//img[@class='hotel-logoUrl']"));

        WebElement bookRoomButton=webDriver.findElement(By.xpath("//button[@class='btn btn-outline-primary float-right openBooking']"));
        bookRoomButton.click();

        WebElement todayCalendar=webDriver.findElement(By.xpath("//div[@class='rbc-day-bg rbc-today']"));

        WebElement firstNameInput=webDriver.findElement(By.xpath("//input[@name='firstname']"));
        firstNameInput.sendKeys("Test");

        WebElement lastNameInput=webDriver.findElement(By.xpath("//input[@name='lastname']"));
        lastNameInput.sendKeys("Testowy");

        WebElement emailInput=webDriver.findElement(By.xpath("//input[@name='email']"));
        emailInput.sendKeys("test.testowy@gmail.com");

        WebElement phoneInput=webDriver.findElement(By.xpath("//input[@name='phone']"));
        phoneInput.sendKeys("66655544422");

        WebElement bookButton=webDriver.findElement(By.xpath("//button[@class='btn btn-outline-primary float-right book-room']"));
        bookButton.click();

        webDriver.quit();
    }
}
