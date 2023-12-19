package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * nextStepButton, yes, no locators and create methods 'void selectImmigrationStatus(String status)'
 * (Note: Use switch statement for select immigration status) and 'void clickNextStepButton()'
 */

public class FamilyImmigrationStatusPage extends Utility {
    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    //========================== Locators ============================//

    //Yes Radio Button
    @CacheLookup
    @FindBy(xpath = "//div[@id='current-question']//div[@class='gem-c-radio govuk-radios__item']/input[@id='response-0']")
    WebElement yesRadioBtn;

    //No Radio Button
    @CacheLookup
    @FindBy(css = "#response-1")
    WebElement noRadioBtn;

    //Continue button
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueBtnForFamilyImmigrationStatusPage;

    //======================== Methods ================================//

    //	Select state My partner of family member have uk immigration status 'yes'
    public void selectImmigrationStatus(String status) {
        switch (status) {
            case "yes":
                clickOnElement(yesRadioBtn);
                log.info("Clicking on yes radio button");
                break;
            case "no":
                clickOnElement(noRadioBtn);
                log.info("Clicking on no radio button");
                break;
            default:
                System.out.println("Please select an option");
        }
    }

    //	Click on Continue button
    public void mouseHoverAndClickOnContinueBtnForFamilyImmigrationStatusPage(){
        mouseHoverToElementAndClick(continueBtnForFamilyImmigrationStatusPage);
        log.info("Clicking on Continue button" + continueBtnForFamilyImmigrationStatusPage.toString());
    }

}
