// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class RegsiterTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void regsiter() {
    // Test name: Regsiter
    // Step # | name | target | value
    // 1 | open | https://dashboard.pawoon.com/login | 
    driver.get("https://dashboard.pawoon.com/login");
    // 2 | setWindowSize | 1366x728 | 
    driver.manage().window().setSize(new Dimension(1366, 728));
    // 3 | click | linkText=Daftar sekarang! | 
    driver.findElement(By.linkText("Daftar sekarang!")).click();
    // 4 | click | id=reg-fullname | 
    driver.findElement(By.id("reg-fullname")).click();
    // 5 | type | id=reg-fullname | TESTER 123
    driver.findElement(By.id("reg-fullname")).sendKeys("TESTER 123");
    // 6 | click | id=reg-email | 
    driver.findElement(By.id("reg-email")).click();
    // 7 | type | id=reg-email | TestCobaEmail123@gmail.com
    driver.findElement(By.id("reg-email")).sendKeys("TestCobaEmail123@gmail.com");
    // 8 | click | id=reg-phone | 
    driver.findElement(By.id("reg-phone")).click();
    // 9 | type | id=reg-phone | 081286778123
    driver.findElement(By.id("reg-phone")).sendKeys("081286778123");
    // 10 | click | id=reg-password | 
    driver.findElement(By.id("reg-password")).click();
    // 11 | type | id=reg-password | testerpawoon
    driver.findElement(By.id("reg-password")).sendKeys("testerpawoon");
    // 12 | click | name=agreement | 
    driver.findElement(By.name("agreement")).click();
    // 13 | click | id=do-regist-step1 | 
    driver.findElement(By.id("do-regist-step1")).click();
    // 14 | click | id=reg-business-name | 
    driver.findElement(By.id("reg-business-name")).click();
    // 15 | type | id=reg-business-name | Kentang Goreng
    driver.findElement(By.id("reg-business-name")).sendKeys("Kentang Goreng");
    // 16 | click | id=reg-business-type | 
    driver.findElement(By.id("reg-business-type")).click();
    // 17 | click | css=.list-parent > li:nth-child(1) > span | 
    driver.findElement(By.cssSelector(".list-parent > li:nth-child(1) > span")).click();
    // 18 | click | css=li:nth-child(1) li:nth-child(1) > span | 
    driver.findElement(By.cssSelector("li:nth-child(1) li:nth-child(1) > span")).click();
    // 19 | click | id=reg-business-city | 
    driver.findElement(By.id("reg-business-city")).click();
    // 20 | type | id=reg-business-city | Bandung
    driver.findElement(By.id("reg-business-city")).sendKeys("Bandung");
    // 21 | click | css=li:nth-child(3) > span:nth-child(1) | 
    driver.findElement(By.cssSelector("li:nth-child(3) > span:nth-child(1)")).click();
    // 22 | click | id=do-regist-step2 | 
    driver.findElement(By.id("do-regist-step2")).click();
    // 23 | click | css=.form-group:nth-child(2) > .btn | 
    driver.findElement(By.cssSelector(".form-group:nth-child(2) > .btn")).click();
    // 24 | click | linkText=Lanjut | 
    driver.findElement(By.linkText("Lanjut")).click();
    // 25 | click | id=name | 
    driver.findElement(By.id("name")).click();
    // 26 | type | id=name | Kentang
    driver.findElement(By.id("name")).sendKeys("Kentang");
    // 27 | click | id=kategori | 
    driver.findElement(By.id("kategori")).click();
    // 28 | type | id=kategori | makanan
    driver.findElement(By.id("kategori")).sendKeys("makanan");
    // 29 | click | id=price | 
    driver.findElement(By.id("price")).click();
    // 30 | type | id=price | 15.000
    driver.findElement(By.id("price")).sendKeys("15.000");
    // 31 | click | css=.btn-upload | 
    driver.findElement(By.cssSelector(".btn-upload")).click();
  }
}
