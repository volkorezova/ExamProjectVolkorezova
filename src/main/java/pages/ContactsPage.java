package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by tatyanavolkorezova on 30.07.17.
 */
public class ContactsPage extends ParentPage {

    @FindBy(xpath=(".//div[@class = 'one_half']/H3[@class = 'text-center']"))
    private WebElement writeUsH3;

    @FindBy(xpath=(".//div[@class = 'address_info2']/H3[@class = 'text-center']"))
    private WebElement callUsH3;


    @FindBy(id="jform_contact_name")
    private WebElement contactName;

    @FindBy(id="jform_contact_email")
    private WebElement contactEmail;

    @FindBy(id="jform_contact_emailmsg")
    private WebElement theme;

    @FindBy(id="jform_contact_message")
    private WebElement messageArea;

    @FindBy(id="jform_contact_email_copy")
    private WebElement checkboxCopyToMe;

    @FindBy(id="jform_contact_email_copy-lbl")
    private WebElement copyLabel;

    @FindBy(xpath = ".//button[@class='subbutton colorchan']")
    private WebElement sendMesButton;

    @FindBy(id="df")
    private WebElement phoneNumberRecallField;

    @FindBy(xpath = ".//button[@class='phone-btn']")
    private WebElement phoneBtn;

    @FindBy(xpath = ".//H4[@class='alert-heading']")
    private WebElement thanxAlert;

    @FindBy(xpath = ".//*[@class='close']")
    private WebElement closeIcon;

    @FindBy(xpath = "html/body")
    private WebElement succsesLetterSend;


    public ContactsPage(WebDriver webDriver) {
        super(webDriver);
    }


    public void openContactPage(){
        open("http://old.qalight.com.ua/contacts.html");
    }

    public void enterContactName(String name){
        actionWithElements.enterText(contactName, name);
    }

    public void enterEmail(String email){
        actionWithElements.enterText(contactEmail, email);
    }

    public void enterTheme(String themeText){
        actionWithElements.enterText(theme, themeText);
    }

    public void enterMessage(String message){
        actionWithElements.enterText(messageArea, message);
    }

    public void clickOnSendMessBtn(){
        actionWithElements.clickOnElement(sendMesButton);
    }

    public void checkBoxCopyToMe(){
        actionWithElements.checkCheckBox(checkboxCopyToMe);
    }

    public boolean checkIsThnxAlertIsPresent(){
        actionWithElements.isElementPresent(thanxAlert);
        return true;
    }

    public void clickOnCallBtn(){
        actionWithElements.clickOnElement(phoneBtn);
    }

    public void enterPhoneNumber(String phone){
        actionWithElements.enterText(phoneNumberRecallField, phone);
    }

    public boolean isSuccesLetterSend() {
        actionWithElements.isElementPresent(succsesLetterSend);
        return true;
    }
}
