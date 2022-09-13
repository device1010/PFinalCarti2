package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.TimePage;
import utilities.DriverManager;

public class TimeSteps {
    TimePage timeSteps = new TimePage(DriverManager.getDriver().driver);
    @And("I click on see timesheet of {string}")
    public void setUserPassword(String name)  {
        timeSteps.clickButtonVerEmpl(name);
    }
    @Then("I verify the timesheet is displayed")
    public void verifyHomePageIsDisplayed(){
        Assert.assertTrue(timeSteps.verifyreportassistence());
    }
}
