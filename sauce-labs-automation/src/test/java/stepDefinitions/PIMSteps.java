package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.PIMPage;
import utilities.DriverManager;

import java.util.List;

public class PIMSteps {
    PIMPage PIMpage = new PIMPage(DriverManager.getDriver().driver);
    @Then("The PIM page should be displayed")
    public void verifyHomePageIsDisplayed(){
        Assert.assertTrue(PIMpage.PIMIsDisplayed());
    }
    @And("I click on Admin button")
    public void clickOnAdminbtn(){
        PIMpage.btnAdminClick();
    }
    @And("I click on add employee button")
    public void clickOnAddEmployee(){
        PIMpage.bntAddemployee();
    }
    @And("I introduce the employee")
    public void clickOnAdminbtn(DataTable employeeinfo){
        List<String> data = employeeinfo.transpose().asList(String.class);
        PIMpage.setTextBoxFName("");
        PIMpage.setTextBoxMName("");
        PIMpage.setTextBoxLName("");

        PIMpage.setTextBoxFName(data.get(0));
        PIMpage.setTextBoxMName(data.get(1));
        PIMpage.setTextBoxLName(data.get(2));
    }
    @And("I click on save employee info button")
    public void verifynewemployee(){
        PIMpage.clicksaveemployeebtn();
    }
    @Then("I verify was created")
    public void ConfirmationMessageDisplayed(){
        Assert.assertEquals("Success\n" +
                "Successfully Saved\n" +
                "×",PIMpage.verifysuccess());
    }
    @And("I set the employee id field with {string}")
    public void verifynewemployee(String idinfo){
        PIMpage.setTextBoxIDSearch(idinfo);
    }
    @And("I click button search")
    public void clickbtnSearch(){
        PIMpage.clickbuttonSearch();
    }
    @And("I verify a message is displayed")
    public void verifyerrormsg(){
        Assert.assertEquals("Info\n" +
                "No Records Found\n" +
                "×",PIMpage.getErrprSearch());
    }
    @And("I click on Time button")
    public void clickOnTimebtn(){
        PIMpage.btnTimeClick();
    }
}
