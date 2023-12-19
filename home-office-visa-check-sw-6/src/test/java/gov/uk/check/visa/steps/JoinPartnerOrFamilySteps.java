package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.FamilyImmigrationStatusPage;
import gov.uk.check.visa.pages.ReasonForTravelPage;
import gov.uk.check.visa.pages.ResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class JoinPartnerOrFamilySteps {
    @And("I select reason to {string}")
    public void iSelectReasonTo(String reason) {
        new ReasonForTravelPage().selectReasonToJoinFamilyOrPartner(reason);
    }

    @And("I click on Continue button after selecting reason to join partner or family")
    public void iClickOnContinueButtonAfterSelectingReasonToJoinPartnerOrFamily() {
        new ReasonForTravelPage().clickOnContinueOfReasonForTravelPage();
    }

    @And("I select state My partner of family member have uk immigration status {string}")
    public void iSelectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatus(String status) {
        new FamilyImmigrationStatusPage().selectImmigrationStatus(status);
    }

    @And("I click on Continue button after selecting status")
    public void iClickOnContinueButtonAfterSelectingStatus() {
        new FamilyImmigrationStatusPage().mouseHoverAndClickOnContinueBtnForFamilyImmigrationStatusPage();
    }

    @Then("I should get result message that {string}")
    public void iShouldGetResultMessageThat(String expectedMessage) {
        Assert.assertEquals(new ResultPage().verifyResultMessageForVisaStatus(), expectedMessage, "Error message is displayed");
    }
}
