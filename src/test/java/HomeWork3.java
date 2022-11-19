import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork3 {
    String BASEURL = "https://www.google.com/";
    String searchLabelName = "q";
    String searchButtonName = "btnK";

    // String imageHyperLinkedTex = "სურათები";

    @Test
    public void googleTest(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();

        chromeDriver.get(BASEURL);
        chromeDriver.findElement(By.name(searchLabelName)).sendKeys("Tato Topuria");
        chromeDriver.findElement(By.name(searchButtonName)).click();

        chromeDriver.close();
    }
}
