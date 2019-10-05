package api;

import commonapi.Base;
import org.openqa.selenium.By;
import pageobject.AccountPage;

import java.io.IOException;

public class FSBase extends Base {

    public FSBase() throws IOException {
    }

    // Test Data
    String userName = readFromExcel(testDataFilePath,"Credential","B2");
    String password = readFromExcel(testDataFilePath,"Credential","C2");


    public void signInToFinalScore () throws InterruptedException {
        clickByXpath(AccountPage.SIGN_IN_LINK);
        typeByXpath(AccountPage.USER_NAME_FIELD, userName);
        typeByXpath(AccountPage.PASSWORD_FIELD, password);
        clickByXpath(AccountPage.SIGN_IN_BUTTON);
    }

    public void signOutFromFinalScore () throws InterruptedException {
        clickByXpath(AccountPage.ACCOUNT_DROP_DOWN_MENU);
        clickByXpath(AccountPage.SIGN_OUT_BUTTON);
    }
}