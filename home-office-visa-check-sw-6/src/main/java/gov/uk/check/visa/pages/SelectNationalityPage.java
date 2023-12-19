package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * nationalityDropDownList, nextStepButton locators and create methods
 * 'void selectNationality(String nationality)' and 'void clickNextStepButton()'
 */
public class SelectNationalityPage extends Utility {
    private static final Logger log = LogManager.getLogger(SelectNationalityPage.class.getName());

    //========================== Locators ============================//

    //Nationality Drop Down List
    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDownList;

    //Continue Button
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueBtnOnSelectNationalityPage;


    //======================== Methods ================================//

    //	Select a Nationality 'Australia'
    public void selectNationality(String nationality) {
        selectByVisibleTextFromDropDown(nationalityDropDownList, nationality);
        log.info("Selecting" + nationality + "from drop down");
    }
    //	Click on Continue button
    public void mouseHoverAndClickOnContinueBtnOnSelectNationalityPage(){
        mouseHoverToElementAndClick(continueBtnOnSelectNationalityPage);
        log.info("Clicking on Continue button" + continueBtnOnSelectNationalityPage.toString());
    }
}
