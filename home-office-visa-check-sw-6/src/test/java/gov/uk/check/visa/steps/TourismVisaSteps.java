package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.ReasonForTravelPage;
import gov.uk.check.visa.pages.ResultPage;
import gov.uk.check.visa.pages.SelectNationalityPage;
import gov.uk.check.visa.pages.StartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TourismVisaSteps {

    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on Accept All cookies button")
    public void iClickOnAcceptAllCookiesButton() {
        new StartPage().mouseHoverAndClickOnAcceptCookiesBtn();
    }

    @And("I click on StartNow button")
    public void iClickOnStartNowButton() {
        new StartPage().mouseHoverAndClickOnStartNowBtn();
    }

    @And("I select a Nationality {string}")
    public void iSelectANationality(String nationality) {
        new SelectNationalityPage().selectNationality(nationality);
    }

    @And("I click on Continue button after selecting Nationality")
    public void iClickOnContinueButtonAfterSelectingNationality() {
        new SelectNationalityPage().mouseHoverAndClickOnContinueBtnOnSelectNationalityPage();
    }

    @And("I select reason for visit {string}")
    public void iSelectReasonForVisit(String reason) {
        new ReasonForTravelPage().selectReasonForTourism(reason);
    }

    @And("I click on Continue button after selecting reason")
    public void iClickOnContinueButtonAfterSelectingReason() {
        new ReasonForTravelPage().clickOnContinueOfReasonForTravelPage();
    }

    @Then("I should get result message {string}")
    public void iShouldGetResultMessage(String expectedMessage) {
        Assert.assertEquals(new ResultPage().verifyResultMessageForAustralia(), expectedMessage, "Error Message is displayed");
    }

}
