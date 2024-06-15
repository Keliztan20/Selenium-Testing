package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Checkout extends Main {
    @Test(priority = 14)
    public void getTabTitle() {
        try {
            // Locate the title element by class name
            WebElement titleElement = driver.findElement(By.cssSelector("h3.item-title a"));

            // Get the text of the title element
            String title = titleElement.getText();

            // Print the title to the console
            System.out.println("CheckOut Title: " + title);
        } catch (Exception e) {
            System.out.println("Failed to get title: " + e.getMessage());
        }
    }

    @Test(priority = 15)
    public void getCheckOutPrice() {
        try {
            // Locate the title element by class name
            WebElement priceElement = driver.findElement(By.cssSelector("div.item-price"));

            // Get the text of the title element
            String price = priceElement.getText();

            // Print the title to the console
            System.out.println("CheckOut Price: " + price);
        } catch (Exception e) {
            System.out.println("Failed to get price: " + e.getMessage());
        }
    }
    @Test(priority = 16)
    public void goToCheckout() {
        // Locate the "Go to checkout" button element using data-test-id attribute
        WebElement checkoutButton = driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[2]/div/div/div[2]/button"));

        // Click on the "Go to checkout" button
        checkoutButton.click();
    }


    @Test(priority = 17)
    public void Guest_button_Click() {
        // Wait for the "Continue as guest" button to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement GuestButtonClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='gxo-btn']")));

        GuestButtonClick.click();
    }
}
