import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Google {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver",
                "C:\\Users\\OMEN 16\\Downloads\\edgedriver_win64\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        System.out.println("Browser Initiated Successfully");

        driver.get("https://www.facebook.com");
        // System.out.println("Website opened Successfully");

        // String title = driver.getTitle();
        // String url = driver.getCurrentUrl();

        // System.out.println("The title : " + title);
        // System.out.println("The url is " + url);

        // WebElement tf = driver.findElement(By.name("q"));

        // tf.sendKeys("What is selenium", Keys.ENTER);

        // Thread.sleep(10000);
        // driver.quit();

    }
}
