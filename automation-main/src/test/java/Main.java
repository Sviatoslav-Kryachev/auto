
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Main {
    WebDriver driver;

    @BeforeClass
    public static void mainPrecondition() {
        final String path = String.format("%s/bin/chromedriver.exe", System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", path);
    }

    @Before
    public void precondition() {
        driver = new ChromeDriver();
    }

    @Test
    public void test1() {
        driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.xpath("")).sendKeys("Sviatoslav");
        driver.findElement(By.xpath("")).sendKeys("Kriachev");
        driver.findElement(By.xpath("")).sendKeys("same92121@gmail.com");
        driver.findElement(By.xpath("")).sendKeys("Sviatoslav");
        driver.findElement(By.xpath("")).click();
        driver.findElement(By.xpath("")).sendKeys("+380508007736");
        driver.findElement(By.xpath("")).sendKeys("Sviatoslav");
        //                        Прописать также для элементов выбора даты  локаторы;
        driver.findElement(By.xpath("")).sendKeys("Sviatoslav");
        driver.findElement(By.xpath("")).sendKeys("Subjects");
 //            Hobbies клик по чекбоксу
        driver.findElement(By.xpath("")).click();
//        Current Address
        driver.findElement(By.xpath("")).sendKeys("Current Address");
        





    }

    @After
    public void postCondition() {
        driver.quit();
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
    }

}
