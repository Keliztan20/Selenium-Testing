package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Search extends Main{
    @Test(priority = 4)
    public void SearchMobiles(){
        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        searchBox.sendKeys( "Mobile Phone");
        driver.findElement(By.id("gh-btn")).click();
    }
}
