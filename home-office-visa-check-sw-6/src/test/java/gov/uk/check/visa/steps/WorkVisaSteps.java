package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.DurationOfStayPage;
import gov.uk.check.visa.pages.ReasonForTravelPage;
import gov.uk.check.visa.pages.ResultPage;
import gov.uk.check.visa.pages.WorkTypePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class WorkVisaSteps {

    @And("I select reason for {string}")
    public void iSelectReasonFor(String reason) {
        new ReasonForTravelPage().selectReasonForWork(reason);
    }

    @And("I select intended to stay for {string}")
    public void iSelectIntendedToStayFor(String lengthOfStay) {
        new DurationOfStayPage().selectLengthOfStay(lengthOfStay);
    }

    @And("I click on Continue button after selecting stay")
    public void iClickOnContinueButtonAfterSelectingStay() {
        new DurationOfStayPage().clickOnContinueButtonForDurationOfLongStayPage();
    }

    @And("I select planning to work for {string}")
    public void iSelectPlanningToWorkFor(String jobType) {
        new WorkTypePage().selectPlanToWork(jobType);
    }

    @And("I click on Continue button after selecting workType")
    public void iClickOnContinueButtonAfterSelectingWorkType() {
        new WorkTypePage().clickOnContinueBtnOnWorkTypePage();
    }

    @Then("I should get result message for {string}")
    public void iShouldGetResultMessageFor(String expectedMessage) {
        Assert.assertEquals(new ResultPage().verifyResultMessageForHCP(), expectedMessage, "Error Message is displayed");
    }
}
