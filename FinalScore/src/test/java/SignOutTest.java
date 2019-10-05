import api.FSBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.AccountPage;

import java.io.IOException;

/**
 * Created by mdalam on 9/7/2019.
 */

public class SignOutTest extends FSBase {

    public SignOutTest() throws IOException {
    }

    @Test (priority = 1, enabled = false)
    public void fsLogOut() throws Exception {

    }

    // Test Case: User should be able to log-out after login.
    @Test (priority = 2, enabled = true)
    public void fsLogOutAfterLogIn() throws Exception {
        signInToFinalScore();
        signOutFromFinalScore();
        sleepfor(2);
        takeTheScreenshot(new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Test (priority = 3, enabled = false)
    public void fsLogin3() throws Exception {


    }
}