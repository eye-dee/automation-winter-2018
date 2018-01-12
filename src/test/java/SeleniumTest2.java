import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest2 extends TestBase {

    @Test
    public void test2() {
        driver.manage().window().maximize();

        driver.navigate().to("https://www.epam.com");
        Assert.assertEquals(driver.getTitle() ,"EPAM | Software Product Development Services");

        WebElement searchButton = driver.findElement(By.cssSelector(".header-search__button"));
        searchButton.click();

        WebElement menuButton = driver.findElement(By.cssSelector(".hamburger-menu__button"));

        Assert.assertTrue(menuButton.isDisplayed());
        Assert.assertEquals(menuButton.getText(), "MENU");
    }
}
