package karatetest;
import com.applitools.eyes.EyesRunner;
import com.applitools.eyes.selenium.ClassicRunner;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.selenium.fluent.Target;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class eyesSelenium {
    private Eyes eyes;
    private WebDriver driver;

    public eyesSelenium() {
        
        this.driver = new ChromeDriver();

        EyesRunner runner = new ClassicRunner();

        eyes = new Eyes(runner);
        eyes.setApiKey(System.getenv("APPLITOOLS_API_KEY"));

    }

    public void getUrl(String url) {
        driver.get(url);
    }

    public void clickByCss(String css) {
        driver.findElement(By.cssSelector(css)).click();
    }

    public void inputByCss(String css, String inputString) {
        driver.findElement(By.cssSelector(css)).sendKeys(inputString);
    }

    public void openEyes(String appName, String testName, int width, int height) {
        eyes.open(driver, appName, testName, new RectangleSize(width, height));
    }

    public void checkEyes() {
        eyes.check(Target.window().fully());
    }

    public void closeEyes() {
        eyes.closeAsync();
    }

}
