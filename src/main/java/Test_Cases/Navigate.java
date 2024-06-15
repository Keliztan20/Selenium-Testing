package Test_Cases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Navigate extends Main {

    @Test(priority = 1)
    @Parameters({"url",})

    public void openUrl(String url){
        driver.get(url);
    }

    @Test(priority = 2)
    @Parameters({"url",})
    public void checkUrl(String url){
        Assert.assertEquals(driver.getCurrentUrl(), url);
        System.out.println("");
    }

}
