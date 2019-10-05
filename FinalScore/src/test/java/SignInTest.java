import api.FSBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by mdalam on 9/7/2019.
 */

public class SignInTest extends FSBase {

    public SignInTest() throws IOException {
    }


    /*
     * User should be able to sign in their account
     */
    @Test (priority = 1, enabled = true)
    public void signIn() throws Exception {
        signInToFinalScore();
        String s = driver.findElement(By.xpath("//*[@id=\"accountActions\"]")).getText();
        System.out.println("the text is: " + s);
        takeTheScreenshot(new Object(){}.getClass().getEnclosingMethod().getName());
        Assert.assertEquals(s, "Hi, Cyber");
    }

    /*
     *  TestID004: User should be able to go to My Account page.
     */
    @Test (priority = 2, enabled = true)
    public void goToMyAccountPage() throws Exception {
        signInToFinalScore();
        //clickByXpath(AccountPage.ACCOUNT_DROP_DOWN_MENU);
        //clickByXpath(AccountPage.MY_ACCOUNT_BUTTON);
        //sleepfor(5);
        //takeTheScreenshot("goToMyAccountPage");
    }


    /*
     *  TestID004: Authorized user should be able to go to search for a product.
     */
    @Test (priority = 3, enabled = false)
    public void searchProduct() throws Exception {
        signInToFinalScore();
        typeByXpathThenEnter("//*[@id=\"input_search_query\"]", "Nike");
        sleepfor(5);

    }

    @Test (priority = 4, enabled = false)
    public void dog() throws Exception {
        signInToFinalScore();
    }

    @Test (priority = 5, enabled = false)
    public void tiger() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/header/nav[1]/div[2]/button")).click();
        Thread.sleep(2000);

    }
}