package drivermanager;

import io.github.bonigarcia.wdm.EdgeDriverManager;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {

    public DriverManager getManager(DriverType driverType) {

        DriverManager driverManager;

        switch (driverType) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;
            case REMOTE:
                driverManager = new RemoteDriverManager();
                break;
            default:
                throw new IllegalStateException("Unexpected driver type " + driverType);
        }
        return driverManager;
    }
}

