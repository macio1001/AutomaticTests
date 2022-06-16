package TestCase;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class TestCase_nr2 {

    //####################################################################################
    //##                                                                                ##
    //##                              Test case number 2                                ##
    //##                https://parabank.parasoft.com/parabank/index.htm                ##
    //##                                Send Payment                                    ##
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

        WebElement loginButton=webDriver.findElement(By.xpath("//input[@class='button']"));
        loginButton.click();

        WebElement textOnWeb=webDriver.findElement(By.xpath("//h1[text()='Accounts Overview']"));

        WebElement textOnWeb2=webDriver.findElement(By.xpath("//*[text()='Bill Pay']"));
        textOnWeb2.click();

        WebElement textOnWeb3=webDriver.findElement(By.xpath("//h1[text()='Bill Payment Service']"));

        WebElement payeeNameInput=webDriver.findElement(By.xpath("//input[@name='payee.name']"));
        payeeNameInput.sendKeys("Test testowy");

        WebElement addressInput=webDriver.findElement(By.xpath("//input[@name='payee.address.street']"));
        addressInput.sendKeys("Testowa 0");

        WebElement cityInput=webDriver.findElement(By.xpath("//input[@name='payee.address.city']"));
        cityInput.sendKeys("Test");

        WebElement stateInput=webDriver.findElement(By.xpath("//input[@name='payee.address.state']"));
        stateInput.sendKeys("Testowo");

        WebElement zipCodeInput=webDriver.findElement(By.xpath("//input[@name='payee.address.zipCode']"));
        zipCodeInput.sendKeys("44-222");

        WebElement phoneNumberInput=webDriver.findElement(By.xpath("//input[@name='payee.phoneNumber']"));
        phoneNumberInput.sendKeys("666555888");

        WebElement accountInput=webDriver.findElement(By.xpath("//input[@name='payee.accountNumber']"));
        accountInput.sendKeys("11555");

        WebElement verifyAccountInput=webDriver.findElement(By.xpath("//input[@name='verifyAccount']"));
        verifyAccountInput.sendKeys("11555");

        WebElement ammountInput=webDriver.findElement(By.xpath("//input[@name='amount']"));
        ammountInput.sendKeys("150");

        WebElement sendPaymentButton=webDriver.findElement(By.xpath("//input[@value='Send Payment']"));
        sendPaymentButton.click();

        WebElement textOnWeb4=webDriver.findElement(By.xpath("//h1[text()='Bill Payment Complete']"));

        webDriver.quit();
    }
}
