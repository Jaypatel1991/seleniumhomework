import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopCommerceChrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Softawre\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("ico-login")).click();
        WebElement username=driver.findElement(By.id("Email"));
        WebElement password=driver.findElement(By.id("Password"));
        username.sendKeys("jaytesting123@gmail.com");
        password.sendKeys("Test@123");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
        System.out.println(driver.getCurrentUrl());
        String PageTitle = driver.getTitle();
        String ExpectedPageTitle = "nopCommerce demo store";
        if (ExpectedPageTitle.equals(driver.getTitle())) {
            System.out.println("Page Title is Correct");
        } else {
            System.out.println("Page Title is incorrect");
        }
        driver.close();
    }
}