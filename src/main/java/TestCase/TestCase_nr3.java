package TestCase;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_nr3 {

    //####################################################################################
    //##                                                                                ##
    //##                              Test case number 3                                ##
    //##                https://parabank.parasoft.com/parabank/index.htm                ##
    //##                              Log in and Log out                                ##
    //##                                                                                ##
    //####################################################################################

    public WebDriver getDriver(){
        WebDriver webDriver=new ChromeDriver();

        webDriver.manage().window().maximize();

        webDriver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");

        return webDriver;
    }

    @Test
    public void findElement(){
        WebDriver webDriver=getDriver();

        WebElement usernameInput=webDriver.findElement(By.xpath("//input[@name='username']"));
        usernameInput.sendKeys("Test");

        WebElement passwordInput=webDriver.findElement(By.xpath("//input[@name='password']"));
        passwordInput.sendKeys("123456");

        WebElement logInButton=webDriver.findElement(By.xpath("//input[@class='button']"));
        logInButton.click();

        WebElement textOnWeb=webDriver.findElement(By.xpath("//h1[text()='Accounts Overview']"));

        WebElement logOutButton=webDriver.findElement(By.xpath("//*[text()='Log Out']"));
        logOutButton.click();

        WebElement textOnWeb2=webDriver.findElement(By.xpath("//h2[text()='Customer Login']"));

        webDriver.quit();
    }
}
