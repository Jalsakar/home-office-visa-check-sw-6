package gov.uk.check.visa.pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * resultMessage locator and create methods 'String getResultMessage()'
 * and 'void confirmResultMessage(String expectedMessage)' (Note Use Assert.assertTrue)
 */
public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    //========================== Locators ============================//

    //Result Message For Australia
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You will not need a visa to come to the UK']")
    WebElement resultMessageForAustralia;

    //Result Message For HCP
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='You need a visa to work in health and care']")
    WebElement resultMessageForHCP;

    //Result Message For Visa Status
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You’ll need a visa to join your family or partner')]")
    WebElement resultMessageForVisaStatus;


    //======================== Methods ================================//

    //	verify result 'You will not need a visa to come to the UK'
//    public String verifyResultMessageForAustralia() {
//        return getTextFromElement(resultMessageForAustralia);
//
//    }

    public String verifyResultMessageForAustralia() {
        String resultMsgForAustralia = getTextFromElement(resultMessageForAustralia);
        log.info("Get text from " + resultMessageForAustralia.toString());
        return resultMsgForAustralia;
    }

    //	verify result 'You need a visa to work in health and care'
    public String verifyResultMessageForHCP() {
        String resultMsgForHCP = getTextFromElement(resultMessageForHCP);
        log.info("Get text from " + resultMessageForHCP.toString());
        return resultMsgForHCP;
    }

    //	verify result 'You’ll need a visa to join your family or partner in the UK'
    public String verifyResultMessageForVisaStatus(){
        String resultMsgForVisaStatus = getTextFromElement(resultMessageForVisaStatus);
        log.info("Get text from " + resultMessageForHCP.toString());
        return resultMsgForVisaStatus;
    }
}
