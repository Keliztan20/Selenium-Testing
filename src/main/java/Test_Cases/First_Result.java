package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;

public class First_Result extends Main{
    @Test(priority = 5)
    public void first_result() throws InterruptedException {
        WebElement firstItem = driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/a/div/span"));
        firstItem.click();
        Thread.sleep(5000L);
        Iterator var2 = driver.getWindowHandles().iterator();

        while(var2.hasNext()) {
            String winHandle = (String)var2.next();
            driver.switchTo().window(winHandle);
        }

    }
}
