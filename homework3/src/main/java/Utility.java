import java.nio.file.Path;
import java.nio.file.Paths;

public class Utility {

    public static void setDriverProps(Enum driverType) {
        Path resourceDirectory = Paths.get("src", "main", "resources");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();

        if (driverType.equals(DriverType.CHROME)) {
            System.setProperty("webdriver.chrome.driver", absolutePath + "/binary/chromedriver.exe");
        }

        if (driverType.equals(DriverType.EDGE)) {
            System.setProperty("webdriver.edge.driver", absolutePath + "/binary/msedgedriver.exe");
        }
    }

}
