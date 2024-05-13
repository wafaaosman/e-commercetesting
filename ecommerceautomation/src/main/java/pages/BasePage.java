package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver= driver;}
    By RegisterButton = By.xpath("//a[@class=\"ico-register\"]");
    By logoutbttn = By.xpath("//a[@class=\"ico-logout\"]");
    public void clickregister(){
        driver.findElement(RegisterButton).click();
    }


    public void Wait_elements(WebDriver driver, int time , By element_name){
        WebDriverWait wait = new WebDriverWait(driver , time );
        wait.until(ExpectedConditions.visibilityOfElementLocated(element_name));

    }
    public boolean IsLogedIn (){
        try {
            driver.findElement(logoutbttn);
            return true;
        }
        catch (Exception e) {
            return false;

        }
    }


}


