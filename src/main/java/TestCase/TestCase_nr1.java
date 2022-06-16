package TestCase;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class TestCase_nr1 {

    //####################################################################################
    //##                                                                                ##
    //##                              Test case number 1                                ##
    //##                https://parabank.parasoft.com/parabank/index.htm                ##
    //##                              Create new account                                ##
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

        WebElement usernameInput=webDriver.findElement(By.name("username"));
        usernameInput.sendKeys("Test");

        WebElement passwordInput=webDriver.findElement(By.name("password"));
        passwordInput.sendKeys("123456");

        WebElement loginButton=webDriver.findElement(By.xpath("//input[@class='button']"));
        loginButton.click();

        WebElement textOnWeb=webDriver.findElement(By.xpath("//*[text()='Accounts Overview']"));

        WebElement openNewAccountText=webDriver.findElement(By.xpath("//*[text()='Open New Account']"));
        openNewAccountText.click();

        WebElement textOnWeb1=webDriver.findElement(By.xpath("//*[text()='Open New Account']"));

        WebElement typeAccountList=webDriver.findElement(By.xpath("//select[@class='input ng-pristine ng-untouched ng-valid ng-not-empty']/option[1]"));
        System.out.println(typeAccountList.isSelected());

        WebElement typeAccountList1=webDriver.findElement(By.xpath("//select[@id='fromAccountId']/option[1]"));
        System.out.println(typeAccountList1.isSelected());

        WebElement saveNewAccountButton=webDriver.findElement(By.xpath("//input[@class='button']"));
        saveNewAccountButton.click();

        webDriver.quit();
    }
}
