package by.itacademy.zaitsev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OnlinerPage {
    private String enterButtonLocator = "//*[@id=\"userbar\"]/div[1]/div/div/div[1]";
    public static String titleAuthFormLocator = "//*[@id=\"auth-container\"]/div/div[2]/div/div[1]";
    private WebDriver driver;

    public OnlinerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickEnterButton() {
        By enterButtonBy = By.xpath(Onliner.enterButtonLocator);
        WebElement enterButtonWebElement = driver.findElement(enterButtonBy);
        enterButtonWebElement.click();
    }

    public String getTitleAuthFormLocator() {
        By titleAuthFormBy = By.xpath(Onliner.titleAuthFormLocator);
        WebElement titleAuthFormWebElement = driver.findElement(titleAuthFormBy);
        return titleAuthFormWebElement.getText();
    }
}
