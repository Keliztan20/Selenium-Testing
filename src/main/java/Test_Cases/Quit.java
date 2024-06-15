package Test_Cases;

import org.testng.annotations.AfterTest;

public class Quit extends Main{
    @AfterTest
    public void quit() {
        driver.quit();
    }
}
