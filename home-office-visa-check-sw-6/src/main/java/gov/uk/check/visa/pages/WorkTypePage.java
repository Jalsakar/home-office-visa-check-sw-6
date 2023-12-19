package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * nextStepButton, selectJobtypeList locators and create methods 'void selectJobType(String job)'
 * and 'void clickNextStepButton()'
 */

public class WorkTypePage extends Utility {

    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());

    //========================== Locators ============================//

    //Select Job Type
    @CacheLookup
    @FindBy(id = "response-0")
    WebElement workTypePlan;

    //Continue button
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueBtnOnWorkTypePage;

    //======================== Methods ================================//

    public void selectPlanToWork(String jobType) {
        clickOnElement(workTypePlan);
        log.info("Clicking on " + workTypePlan.toString() + " button");
    }

    //Click on Continue button
    public void clickOnContinueBtnOnWorkTypePage() {
        mouseHoverToElementAndClick(continueBtnOnWorkTypePage);
        log.info("Clicking on Continue button" + continueBtnOnWorkTypePage.toString());
    }
}
