package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminPage {
    WebDriver driver;
    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    @FindBy(xpath = "//a[text()='Nationalities']/ancestor::li")
    WebElement nationalitiesbtn;
    @FindBy(css = "button.oxd-button.oxd-button--medium.oxd-button--secondary")
    WebElement btnAdd;
    @FindBy(xpath = "//form/div/div/div/input")
    WebElement textboxName;
    @FindBy(css = "button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
    WebElement savebtn;

    public AdminPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public void nationalitiesbtnclick() {
        nationalitiesbtn.click();
    }
    public void addbtnclick() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(btnAdd));
        btnAdd.click();
    }
    public void setTextboxName(String Nationalitie){

        textboxName.sendKeys(Nationalitie);
    }
    public void savebtnclick(){
        savebtn.click();
    }
    public Boolean verifyNationalitieDisplayed(String nat){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='oxd-table-body']/div/div/div/div[text()='"+nat+"']")));
        WebElement productLink = driver.findElement(By.xpath("//div[@class='oxd-table-body']/div/div/div/div[text()='"+nat+"']"));
        return productLink.isDisplayed();
    }
}
