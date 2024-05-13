package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage
        extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }


    By searchTextBox = By.id("id=\"small-searchterms\"");
    By searchButton = By.xpath("//button[@class=\"button-1 search-box-button\"]");


    public void enterTextInSearchBox(String text) {
        Wait_elements(driver, 20000, searchTextBox);
        driver.findElement(searchTextBox).sendKeys(text);
    }

    public void clickOnSearchButton() {
        Wait_elements(driver, 20000, searchButton);
        driver.findElement(searchButton).click();
    }
}

