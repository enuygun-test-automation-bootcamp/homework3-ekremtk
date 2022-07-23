import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LoginPage {
    WebDriver driverChrome;
    WebDriver driverEdge;

    public LoginPage() {

    }

    public LoginPage(List<WebDriver> driverList) {
        this.driverChrome = driverList.get(0);
        this.driverEdge = driverList.get(1);
    }

    public void openLoginPage() {
        this.driverChrome.findElement(By.id("ctx-LoginBtn")).click();
        this.driverEdge.findElement(By.id("ctx-LoginBtn")).click();
    }
}
