package Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegisterPage;

public class TestCases extends BaseTest {
    @Test(priority = 1)
    public void Register_with_new_user() {
        RegisterPage regpage = new RegisterPage(driver);
        regpage.clickregister();
        regpage.choosegenderbutton();
        regpage.enterfstname("softhard");
        regpage.enterlastname("test");
        regpage.selectday("28");
        regpage.selectMonth("November");
        regpage.selectYear("2018");
        regpage.enteremail("testi@gmail.com");
        regpage.InsertCompanyName("amazon");
        regpage.enterpassword("567891");
        regpage.reenterpassword("567891");
        regpage.submitregister();
        Assert.assertEquals(regpage.registermessge(),"Your registration completed");

    }
    @Test(priority = 4)
    public void Login_correct_User() {
        LoginPage login = new LoginPage(driver);
        login.loginbuttonkey();
        login.enterEmailINEmailBox("testr@gmail.com");
        login.enterPasswordInPasswordBox("567891");
        login.loginButtonsubmitkey();
        Assert.assertTrue(login.IsLogedIn());

    }
    @Test(priority = 2)

    public void Register_with_old_user () {

        RegisterPage regpage = new RegisterPage(driver);
        regpage.clickregister();
        regpage.enterfstname("softhard");
        regpage.enterlastname("test");
        regpage.enteremail("testni@gmail.com");
        regpage.enterpassword("567891");
        regpage.reenterpassword("567891");
        regpage.submitregister();
        Assert.assertEquals(regpage.INCORRECTregistermess(), "The specified email already exists");
    }
    @DataProvider(name = "loginData")
    public Object[][] providelogindata(){
        return new Object[][]{
                {"test@gmail.com", "56789"},
                {"testo@gmail.com","67890"}
        };
    }

    @Test(dataProvider = "loginData")
    public void Login_Incorrect_User(String username,String password){

        LoginPage login = new LoginPage(driver);
        login.loginbuttonkey();
        login.enterEmailINEmailBox(username);
        login.enterPasswordInPasswordBox(password);
        login.loginButtonsubmitkey();
        Assert.assertEquals(login.loginincorrectmess(),"Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");
    }
}
