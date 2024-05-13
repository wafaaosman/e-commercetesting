package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends BasePage {



    public RegisterPage(WebDriver driver){
        super(driver);

    }


    By genderbutton = By.xpath("//label[@for=\"gender-female\"]");

    By firstname=By.xpath("//input[@id=\"FirstName\"]");
    By secondName=By.xpath("//input[@id=\"LastName\"]");
    By Day = By.xpath("//select[@name=\"DateOfBirthDay\"]");
    By MONTH = By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    By Year = By.xpath("//select[@name=\"DateOfBirthYear\"]");

    By emailtextbox = By.xpath("//input[@type=\"email\"]");

    By password=By.xpath("//input[@id=\"Password\"]");
    By passwordconfirm=By.xpath("//input[@id=\"ConfirmPassword\"]");
    By Registerkeypress=By.xpath("//button[@name=\"register-button\"]");
    By RegisterMessage=By.xpath("//div[@class=\"result\"]");
    By IncorrectRegisterMessage=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/ul/li");
    By Companyname = By.xpath("//input[@id=\"Company\"]");


    public void selectday(String value){
        Select dropdownElement = new Select(driver.findElement(Day));
        dropdownElement.selectByVisibleText(value);
    }
    public void selectMonth(String value){
        Select dropdownElement = new Select(driver.findElement(MONTH));
        dropdownElement.selectByVisibleText(value);
    }
    public void selectYear(String value){
        Select dropdownElement = new Select(driver.findElement(Year));
        dropdownElement.selectByVisibleText(value);
    }
    public void enterfstname(String fname){
        Wait_elements(driver,20000,firstname);
        driver.findElement(firstname).clear();
        driver.findElement(firstname).sendKeys(fname);
    }
    public void enterlastname(String lname){
        Wait_elements(driver,20000,secondName);
        driver.findElement(secondName).clear();
        driver.findElement(secondName).sendKeys(lname);
    }

    public void enteremail(String mail){
        Wait_elements(driver,20000,emailtextbox);
        driver.findElement(emailtextbox).clear();
        driver.findElement(emailtextbox).sendKeys(mail);
    }

    public void enterpassword(String pass){
        Wait_elements(driver,20000,password);
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(pass);
    }

    public void reenterpassword(String cpass){
        Wait_elements(driver,20000,passwordconfirm);
        driver.findElement(passwordconfirm).clear();
        driver.findElement(passwordconfirm).sendKeys(cpass);
    }
    public void submitregister(){
        Wait_elements(driver,20000,Registerkeypress);
        driver.findElement(Registerkeypress).click();
    }
    public String registermessge(){
        return driver.findElement(RegisterMessage).getText();

    }
    public String INCORRECTregistermess(){
        return driver.findElement(IncorrectRegisterMessage).getText();
    }
    public void InsertCompanyName(String company){
        driver.findElement(Companyname).sendKeys(company);
    }
    public void choosegenderbutton(){
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(genderbutton)).click().perform();
    }

}
