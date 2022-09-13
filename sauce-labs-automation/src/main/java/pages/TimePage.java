package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TimePage {
    WebDriver driver;

    @FindBy(css = "p.oxd-text.oxd-text--p.orangehrm-timeperiod-title")
    WebElement reportAssistence;
    @FindBy(css = "//div/div[text()='Linda Jane Anderson']/ancestor::div/div/div/button[@class='oxd-button oxd-button--medium oxd-button--text oxd-table-cell-action-space']")
    WebElement buttonVer;
    @FindBy(css="div.oxd-autocomplete-text-input--before")
    WebElement seahrchNames;
    //h6[text()='Reporte  de asistencia de Linda Anderson']

    public TimePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickButtonVerEmpl(String nameemp){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/div[text()='"+nameemp+"']/ancestor::div/div/div/button[@class='oxd-button oxd-button--medium oxd-button--text oxd-table-cell-action-space']")));
        WebElement productLink = driver.findElement(By.xpath("//div/div[text()='"+nameemp+"']/ancestor::div/div/div/button[@class='oxd-button oxd-button--medium oxd-button--text oxd-table-cell-action-space']"));
        productLink.click();
    }
    public boolean verifyreportassistence(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(reportAssistence));
        return reportAssistence.isDisplayed();
    }

}
