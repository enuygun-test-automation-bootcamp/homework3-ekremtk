import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class LoginPageTest {
    DriverSetup driverSetup;
    LoginPage loginPage;
    List<WebDriver> driverSetupList;

    public LoginPageTest() {
        driverSetup = new DriverSetup();
        driverSetupList = new ArrayList<>();

        driverSetupList.add(driverSetup.chromeDriver);
        driverSetupList.add(driverSetup.edgeDriver);

        loginPage = new LoginPage(driverSetupList);
    }

    public void checkOpenWebV2() {

        driverSetup.open("https://www.enuygun.com");

        String openedWebApp = driverSetup.chromeDriver.getCurrentUrl();
        if (openedWebApp.equals("https://www.enuygun.com/")) {
            System.out.println("Passed for Chrome");
        } else {
            System.out.println("Failed for Chrome");
            System.out.println("Because opened web page url is: " + openedWebApp);
        }

        openedWebApp = driverSetup.edgeDriver.getCurrentUrl();
        if (openedWebApp.equals("https://www.enuygun.com/")) {
            System.out.println("Passed for Edge");
        } else {
            System.out.println("Failed for Edge");
            System.out.println("Because opened web page url is: " + openedWebApp);
        }
    }


    public void checkOpenLogin() {
        loginPage.openLoginPage();
    }

}
