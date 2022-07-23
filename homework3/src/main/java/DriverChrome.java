import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverChrome {

    public WebDriver driver;

    public DriverChrome() {
        Utility.setDriverProps(DriverType.CHROME);

        ChromeOptions options = new ChromeOptions();


        options.addArguments("start-maximized", "user-data-dir=C:\\Users\\ekrem\\AppData\\Local\\Google\\Chrome\\User Data");;

        this.driver = new ChromeDriver(options);
    }

}
