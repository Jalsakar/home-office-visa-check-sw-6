package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * nextStepButton, reasonForVisitList locators and create methods
 * 'void selectReasonForVisit(String reason)' and 'void clickNextStepButton()'
 */

public class ReasonForTravelPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());

    //========================== Locators ============================//

    //Tourism Radio Btn
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Tourism')]")
    WebElement tourismRadioBtn;

    //Work Radio Btn
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Work, academic visit or business')]")
    WebElement workRadioBtn;

    //Join Family And Partner Radio Button
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Join partner or family for a long stay')]")
    WebElement joinFamilyAndPartnerRadioBtn;

    //Continue button on Reason for Travel
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueBtnOnReasonForTravelPage;

    //======================== Methods ================================//

    //	Select reason 'Tourism'
    public void selectReasonForTourism(String reason) {
        clickOnElement(tourismRadioBtn);
        log.info("Clicking on " + reason.toString() + " button");
    }

    //	Select reason 'Work'
    public void selectReasonForWork(String reason) {
        clickOnElement(workRadioBtn);
        log.info("Clicking on " + reason.toString() + " button");
    }
    //	Select reason 'Join Family or Partner'
    public void selectReasonToJoinFamilyOrPartner(String reason) {
        clickOnElement(joinFamilyAndPartnerRadioBtn);
        log.info("Clicking on " + reason.toString() + " button");
    }

    //	Click on Continue button
    public void clickOnContinueOfReasonForTravelPage() {
        clickOnElement(continueBtnOnReasonForTravelPage);
        log.info("Clicking on Continue button" + continueBtnOnReasonForTravelPage.toString());
    }


}
