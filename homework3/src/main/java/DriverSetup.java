import org.openqa.selenium.WebDriver;

import java.util.List;

public class DriverSetup {

    WebDriver chromeDriver;
    WebDriver edgeDriver;

    List<WebDriver> driverSetupList;

    public DriverSetup() {
        this.chromeDriver = new DriverChrome().driver;
        this.edgeDriver = new DriverEdge().driver;
    }

    public List<WebDriver> setupDrivers() {
        driverSetupList.add(this.chromeDriver);
        driverSetupList.add(this.edgeDriver);
        return driverSetupList;
    }

    public void open(String url) {
        Utility.setDriverProps(DriverType.CHROME);
        Utility.setDriverProps(DriverType.EDGE);

        this.chromeDriver.get(url);
        this.edgeDriver.get(url);
    }

}
