package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * nextStepButton, lessThanSixMonths, moreThanSixMonths locators and create methods
 * 'void selectLengthOfStay(String moreOrLess)'
 * (Note: use switch statement for select moreOrLess stay)
 * and 'void clickNextStepButton()'
 */

public class DurationOfStayPage extends Utility {

    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());

    //========================== Locators ============================//

    //stay for more than six months
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'longer than 6 months')]")
    WebElement stayForMoreThanSixMonth;

    //stay for less than six months
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'6 months or less')]")
    WebElement stayForLessThanSixMonths;

    //Continue button
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueBtnOnDurationOfStayPage;

    //======================== Methods ================================//

    //switch statement for select moreOrLess stay
    public void selectLengthOfStay(String moreOrLess) {
        moreOrLess = "more than 6 months";
        switch (moreOrLess) {
            case "more than 6 months":
                clickOnElement(stayForMoreThanSixMonth);
                log.info("selecting more than six month radio button");
                break;
            case "6 months or less":
                clickOnElement(stayForLessThanSixMonths);
                log.info("selecting six month or less radio button");
                break;
            default:
                System.out.println("Please select one option");
        }
    }

    //	Click on Continue button on Duration Of Stay Page
    public void clickOnContinueButtonForDurationOfLongStayPage() {
        mouseHoverToElementAndClick(continueBtnOnDurationOfStayPage);
        log.info("Clicking on Continue button" + continueBtnOnDurationOfStayPage.toString());
    }

}