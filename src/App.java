import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        System.setProperty("webdriver.edge.driver",
                "C:\\Users\\OMEN 16\\Downloads\\edgedriver_win64\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        // System.out.println("Browser Initiated Successfully");

        driver.get("https://www.facebook.com");

        Thread.sleep(10000);
    }
}
