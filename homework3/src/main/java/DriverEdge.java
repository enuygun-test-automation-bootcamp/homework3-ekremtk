import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverEdge {
    public WebDriver driver;

    public DriverEdge() {
        Utility.setDriverProps(DriverType.EDGE);
        this.driver = new EdgeDriver();
    }
}
