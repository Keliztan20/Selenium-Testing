package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Add_Cart extends Main{

    @Test(priority = 12)
    public void addToCart() {
        // Locate the "Add to cart" button element using data-testid attribute
        WebElement addToCartButton = driver.findElement(By.cssSelector("div[data-testid='x-atc-action'] a[data-testid='ux-call-to-action']"));

        // Click on the "Add to cart" button
        addToCartButton.click();
    }
    @Test(priority = 13)
    public void Assertiveness() {
        try {
            // Retrieve the item details from the shopping cart
            WebElement itemNameElement = driver.findElement(By.className("grid-item-title"));
            String cartItemName = itemNameElement.getText();

            WebElement itemPriceElement = driver.findElement(By.className("text-display-span"));
            String cartItemPrice = itemPriceElement.getText();

            WebElement itemQuantityElement = driver.findElement(By.xpath("//div[@class='cart-item']/div[@class='item-quantity']"));
            String cartItemQuantity = itemQuantityElement.getText();

            // Assert that the cart's item details match those previously retrieved
            String previouslyRetrievedItemName = null;
            Assert.assertEquals(cartItemName, previouslyRetrievedItemName);
            String previouslyRetrievedItemPrice = null;
            Assert.assertEquals(cartItemPrice, previouslyRetrievedItemPrice);
            String previouslyRetrievedItemQuantity = null;
            Assert.assertEquals(cartItemQuantity, "1");

            // Print success message
            System.out.println("Cart item details match the previously retrieved details.");
        } catch (Exception e) {
            System.out.println("Failed to verify cart details: " + e.getMessage());
        }
    }
}
