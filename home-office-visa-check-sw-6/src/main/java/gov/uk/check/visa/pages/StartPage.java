package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * startNowButton locators and create method 'void clickStartNow()'
 */

public class StartPage extends Utility {
    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

//========================== Locators ============================//
    //Accept Cookies Btn
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Accept additional cookies']")
    WebElement acceptCookiesBtn;

    //StartNow Button
    @CacheLookup
    @FindBy(css = ".gem-c-button.govuk-button.govuk-button--start")
    WebElement startNowBtn;

//======================== Methods ================================//

    //Click on Accept Cookies Button
    public void mouseHoverAndClickOnAcceptCookiesBtn() {
        mouseHoverToElementAndClick(acceptCookiesBtn);
        log.info("Clicking on Accept All Cookie button");
    }

    //  Click on StartNow button
    public void mouseHoverAndClickOnStartNowBtn() {
        mouseHoverToElementAndClick(startNowBtn);
        log.info("Clicking on StartNow button" + startNowBtn.toString());
    }
}