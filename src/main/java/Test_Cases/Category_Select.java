package Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Category_Select extends Main{
    @Test(priority = 3)
    public void Select_Category(){
        // Find the category dropdown menu and select "Cell Phones & Accessories"
        WebElement categoryDropdown = driver.findElement(By.id("gh-cat"));
        Select select = new Select(categoryDropdown);
        select.selectByVisibleText("Cell Phones & Accessories");

        // Verify the correct category selected
        String selectedCategoryText = select.getFirstSelectedOption().getText();
        Assert.assertEquals("Cell Phones & Accessories", selectedCategoryText);
    }
}
