package pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PIMPage {
    WebDriver driver;
    @FindBy(className = "oxd-userdropdown-tab")
    WebElement userimg;
    @FindBy(className = "oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module")
    WebElement PIMTitle;
    @FindBy(linkText = "Logout")
    WebElement logoutbtn;
    @FindBy(xpath = "//span[text()='Admin']/ancestor::li")
    WebElement btnAdmin;
    @FindBy(xpath = "//span[text()='Time']/ancestor::li")
    WebElement btnTime;
    @FindBy(xpath = "//a[text()='Add Employee']")
    WebElement btnAddEmployee;
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement textBoxFName;
    @FindBy(xpath = "//input[@placeholder='Middle Name']")
    WebElement textBoxMName;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement textBoxLName;
    @FindBy(xpath = "//button[text()=' Save ']")
    WebElement saveemployeebtn;
    @FindBy(id = "oxd-toaster_1")
    WebElement successBox;
    @FindBy(xpath = "//label[text()='Employee Id']/ancestor::div/div/input[@class='oxd-input oxd-input--active']")
    WebElement textBoxIDSearch;
    @FindBy(css = "button.oxd-button.oxd-button--medium.oxd-button--secondary.orangehrm-left-space")
    WebElement buttonsearchEmployee;

    public PIMPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void userImgClick(){
        userimg.click();
    }
    public void userLogoutClick(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(logoutbtn));
        logoutbtn.click();
    }
    public boolean PIMIsDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(userimg));
        boolean PIMIsDisplayed = userimg.isDisplayed();
        return PIMIsDisplayed;
    }
    public void btnAdminClick(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(btnAdmin));
        btnAdmin.click();
    }
    public void btnTimeClick(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(btnTime));
        btnTime.click();
    }
    public void bntAddemployee(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(btnAddEmployee));
        btnAddEmployee.click();
    }
    public void setTextBoxFName(String fname) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(textBoxFName));
        textBoxFName.sendKeys(fname);
    }
    public void clicksaveemployeebtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(saveemployeebtn));
        saveemployeebtn.click();
    }
    public void setTextBoxMName(String MName) {
        textBoxMName.sendKeys(MName);
    }
    public void setTextBoxLName(String LName) {
        textBoxLName.sendKeys(LName);
    }
    public String verifysuccess(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(successBox));
        return successBox.getText();
    }
    public void setTextBoxIDSearch(String IDSearch){
        textBoxIDSearch.sendKeys(IDSearch);
    }
    public void clickbuttonSearch(){
        buttonsearchEmployee.click();
    }
    public String getErrprSearch(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(successBox));
        System.out.println("a"+successBox.getText()+"a");
        System.out.println("b"+successBox.getText()+"b");
        return successBox.getText();
    }
}
