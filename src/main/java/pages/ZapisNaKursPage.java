package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by tatyanavolkorezova on 23.07.17.
 */
public class ZapisNaKursPage extends ParentPage {

    @FindBy (xpath =".//select[@name='_7c8289bf6b8e80c1749ef54ab01b92b8']")
    private WebElement chooseKursDD;

    @FindBy(id = "z_sender0")
    private WebElement inputSurname;

    @FindBy(id = "z_text1")
    private WebElement inputName;

    @FindBy (id="z_text0")
    private WebElement inputPhoneNumber;

    @FindBy(id = "z_sender1")
    private WebElement inputEMail;

    @FindBy (id = "z_text2")
    private WebElement inputSkype;

    @FindBy(xpath =".//*[@name ='_e926ba2b2813f56de8fc13877057e908']")
    private WebElement knowSorceDD;

    @FindBy (xpath = ".//*[@name='_ad21040e29142e22bc370e7ecdb9e4b2']")
    private WebElement questionArea;

    @FindBy(xpath=".//button[@class='btn btn-success']")
    private WebElement submitBtn;

    @FindBy(xpath = ".//button[@class='btn btn-danger']")
    private WebElement resetBtn;

    @FindBy(xpath = ".//*[@class='alert alert-success']")
    private WebElement successAlert;


    //xpaths for alert with errors
    @FindBy(xpath = ".//*[@class='alert alert-error']/ul/li[1]")
    private WebElement wrongValuaSurname;

    @FindBy(xpath = ".//*[@class='alert alert-error']/ul/li[2]")
    private WebElement wrongValuaName;

    @FindBy(xpath = ".//*[@class='alert alert-error']/ul/li[3]")
    private WebElement wrongValuaPhoneNumber;

    @FindBy(xpath = ".//*[@class='alert alert-error']/ul/li[4]")
    private WebElement wrongValuaEMail;

    @FindBy(xpath = ".//*[@class='alert alert-error']/ul/li[5]")
    private WebElement wrongValuaSkype;

    @FindBy(xpath = ".//*[@class='alert alert-error']/ul/li[6]")
    private WebElement wrongValuaKnowSource;


    WebElement[] masLocators = {chooseKursDD, inputSurname, inputEMail, inputName, inputPhoneNumber, inputSkype, questionArea, knowSorceDD };

    public ZapisNaKursPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void openZapisNaKursPage(){
        open("http://old.qalight.com.ua/zapisatsya-na-kursy.html");

    }

    public void selectElementFromDDTypeOfKursByValue(String valuaFromDD){
        actionWithElements.selectTextInDDByValue(chooseKursDD, valuaFromDD);

    }

    public void selectElementFromDDByTextTypeKurs(String text){
        actionWithElements.selectTextInDDByText(chooseKursDD, text);
    }

    public void selectElementFromDDByIndexKursType(int index){

        actionWithElements.selectTextInDDByIndex(chooseKursDD, index);
    }


    public void enterSurname(String surName){
        actionWithElements.enterText(inputSurname, surName);

    }

    public void enterName(String name){
        actionWithElements.enterText(inputName,name);
    }

    public void enterPhone(String phoneNumber){

        actionWithElements.enterText(inputPhoneNumber, phoneNumber);
    }

    public void enterEmail(String eMail){
        actionWithElements.enterText(inputEMail, eMail);

    }


    public void enterSkype(String skype){
        actionWithElements.enterText(inputSkype, skype);

    }

    public void selectElementFromDDKnowSorceByValue(String valueFromDDSource){
        actionWithElements.selectTextInDDByValue(knowSorceDD,valueFromDDSource);
    }

    public void selectElementFromDDKnowSourceByIndex(int index){
        actionWithElements.selectTextInDDByIndex(knowSorceDD, index);
    }

    public void fillQuestionArea(String areaText){
        actionWithElements.enterText(questionArea, areaText);
    }

    public void clickButtonSend(){
        actionWithElements.clickOnElement(submitBtn);
    }

    public void clickButtonReset(){
        actionWithElements.clickOnElement(resetBtn);
    }

    public boolean isSuccessAlertIsPresent(){
        actionWithElements.isElementPresent(successAlert);
        return true;
    }

    public void clickOnElementDDChooseCource(){
        actionWithElements.clickOnElement(chooseKursDD);

    }

    public boolean isErroWrongSurnamerPresent(){
        return actionWithElements.isElementPresent(wrongValuaSurname);
    }

    public boolean isErroWrongNamePresent(){
        return actionWithElements.isElementPresent(wrongValuaName);
    }

    public boolean isErroWrongPhonePresent(){
        return actionWithElements.isElementPresent(wrongValuaPhoneNumber);
    }

    public boolean isErroWrongEmailPresent(){
        return actionWithElements.isElementPresent(wrongValuaEMail);
    }

    public boolean isErroWrongSkypePresent(){
        return actionWithElements.isElementPresent(wrongValuaSkype);
    }

    public boolean isErroWrongKnowSourcePresent(){
        return actionWithElements.isElementPresent(wrongValuaKnowSource);
    }

    public boolean areAllFieldsAreCleared() {

        for (int i = 0; i <= 7; i++) {
            if (masLocators[i].getAttribute("value") != "") {
                return false;
            }
        }
        return true;
    }
}
