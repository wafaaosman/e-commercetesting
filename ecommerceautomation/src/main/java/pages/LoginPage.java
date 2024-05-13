package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{


    public LoginPage(WebDriver driver){
        super(driver);
    }
    //By loginbutton = By.xpath("//a[normalize-space()='Log in']");
    By loginButton = By.xpath("//a[@class=\"ico-login\"]");
    By EmailTextBox = By.xpath("//input[@type=\"email\"]");
    By passwordTextBox = By.xpath("//input[@class=\"password\"]");
    By loginsubmitButton= By.xpath("//button[@class=\"button-1 login-button\"]");
    By welcomeMessage=By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");

    By MyAccountButton=By.xpath(" //a[@class='ico-account']");
    By LoginErrorMessage=By.xpath("//div[@class='message-error validation-summary-errors']");

    public void enterEmailINEmailBox(String eemail){
        Wait_elements(driver,20000,EmailTextBox);
        driver.findElement(EmailTextBox).clear();
        driver.findElement(EmailTextBox ).sendKeys(eemail);}
    public void enterPasswordInPasswordBox(String pass){
        Wait_elements(driver,20000,passwordTextBox);
        driver.findElement(passwordTextBox).clear();
        driver.findElement(passwordTextBox).sendKeys(pass);}
    public void loginButtonsubmitkey(){
        Wait_elements(driver,20000,loginsubmitButton);
        driver.findElement(loginsubmitButton).click();}
    public String welcomeMess(){return driver.findElement(welcomeMessage).getText();}
    public void MyAccountBttn(){
        Wait_elements(driver,20000,MyAccountButton);
        driver.findElement(MyAccountButton).click();
    }
    public String loginincorrectmess(){
        return driver.findElement(LoginErrorMessage).getText();
    }
    public void loginbuttonkey(){
        Wait_elements(driver,20000,loginButton);
        driver.findElement(loginButton).click();
    }


}
