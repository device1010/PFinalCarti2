package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AdminPage;
import utilities.DriverManager;

public class AdminSteps {
    AdminPage adminPage = new AdminPage(DriverManager.getDriver().driver);

    @Then("I click on Nationalities button")
    public void clickNationalitiesbtn(){
        adminPage.nationalitiesbtnclick();
    }
    @And("I click on add button")
    public void clickAddbtn(){
        adminPage.addbtnclick();
    }
    @And("I introduce {string} nationalities")
    public void writenationalitie(String nationalitie){
        adminPage.setTextboxName(nationalitie);
    }
    @And("I click on save button")
    public void clickSavebtn(){
        adminPage.savebtnclick();
    }
    @And("I verify {string} is displayed")
    public void displayednationalitie(String nat){
        Assert.assertTrue(adminPage.verifyNationalitieDisplayed(nat));
    }

}
