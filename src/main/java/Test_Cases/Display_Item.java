package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Display_Item extends Main{
    @Test(priority = 6)
    public void getTitle() {
        try {
            // Locate the title element by class name
            WebElement titleElement = driver.findElement(By.cssSelector("h1.x-item-title__mainTitle > span.ux-textspans--BOLD"));

            // Get the text of the title element
            String title = titleElement.getText();

            // Print the title to the console
            System.out.println("Title: " + title);
        } catch (Exception e) {
            System.out.println("Failed to get title: " + e.getMessage());
        }
    }

    @Test(priority = 7)
    public void getPrice() {
        try {
            // Locate the title element by class name
            WebElement priceElement = driver.findElement(By.cssSelector("div.x-price-primary > span.ux-textspans"));

            // Get the text of the title element
            String price = priceElement.getText();

            // Print the title to the console
            System.out.println("Price: " + price);
        } catch (Exception e) {
            System.out.println("Failed to get title: " + e.getMessage());
        }
    }


    @Test( priority = 9)
    public void selectPlug() {
        try {
            WebElement selectBox = driver.findElement(By.id("x-msku__select-box-1000"));
            Select selectBoxLable = new Select(selectBox);
            selectBoxLable.selectByIndex(1);
        } catch (Exception var3) {
            System.out.println("plug dropdown not found");
        }

    }

    @Test(
            priority = 10
    )
    public void selectColor() {
        try {
            WebElement selectBox = driver.findElement(By.id("x-msku__select-box-1001"));
            Select selectBoxLable = new Select(selectBox);
            selectBoxLable.selectByIndex(1);
        } catch (Exception var3) {
            System.out.println("Color dropdown not found");
        }

    }
}
