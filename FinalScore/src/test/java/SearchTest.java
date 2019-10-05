import api.FSBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.HomePage;

import java.io.IOException;

public class SearchTest extends FSBase {

    public SearchTest() throws IOException {
    }

    @Test(priority = 1, enabled = true)
    public void searchProduct() throws Exception {
        clickByXpath(HomePage.SEARCH_FIELD);
        typeByXpath(HomePage.SEARCH_FIELD, readFromExcel(testDataFilePath, "product", "B2"));
        clickByXpath(HomePage.SEARCH_ICON);
        takeTheScreenshot(new Object(){}.getClass().getEnclosingMethod().getName());
        Assert.assertEquals(driver.getTitle(), "Nike | Final-Score");
    }

    @Test(priority = 1, enabled = true)
    public void searchProduct2() throws Exception {
        // this is a new test case that I have automated.
    }
}
