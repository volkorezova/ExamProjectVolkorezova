package zapisNaKursTests;

import org.junit.Test;
import parentTest.ParentTest;

/**
 * Created by tatyanavolkorezova on 30.07.17.
 */
public class ZapisNaKursTests extends ParentTest{

    @Test
    public void validZapisNaKur(){
        zapisNaKursPage.openZapisNaKursPage();
        zapisNaKursPage.clickOnElementDDChooseCource();
       // zapisNaKursPage.selectElementFromDDTypeOfKursByValue(" Базовый модуль тестирования ПО ( дневная группа)");
        zapisNaKursPage.selectElementFromDDByTextTypeKurs(" Android");
        zapisNaKursPage.enterSurname("Volkorezova");
        zapisNaKursPage.enterName("Tatyna");
        zapisNaKursPage.enterPhone("0665678789");
        zapisNaKursPage.enterEmail("qqq@qqq.com");
        zapisNaKursPage.enterSkype("wwwwwwwww");
        zapisNaKursPage.selectElementFromDDKnowSorceByValue(" рекламная листовка/ визитка/ буклет");
        zapisNaKursPage.fillQuestionArea("area area area area aretcccff");
        zapisNaKursPage.clickButtonSend();
        checkAC("Success alert isn't displayed", zapisNaKursPage.isSuccessAlertIsPresent(),true);

    }

    @Test
    public void invalidZapisNaKursWithEmptyFields(){
        zapisNaKursPage.openZapisNaKursPage();
        zapisNaKursPage.enterSurname("");
        zapisNaKursPage.enterName("");
        zapisNaKursPage.enterPhone("");
        zapisNaKursPage.enterEmail("");
        zapisNaKursPage.enterSkype("");
        zapisNaKursPage.selectElementFromDDKnowSorceByValue("");
        zapisNaKursPage.fillQuestionArea("");
        zapisNaKursPage.clickButtonSend();
        checkAC("Error alert Surname isn't displayed", zapisNaKursPage.isErroWrongSurnamerPresent(),true);
        checkAC("Error alert Name isn't displayed", zapisNaKursPage.isErroWrongNamePresent(),true);
        checkAC("Error alert Phone isn't displayed", zapisNaKursPage.isErroWrongPhonePresent(),true);
        checkAC("Error alert Email isn't displayed", zapisNaKursPage.isErroWrongEmailPresent(),true);
        checkAC("Error alert Skype isn't displayed", zapisNaKursPage.isErroWrongSkypePresent(),true);
        checkAC("Error alert Source isn't displayed", zapisNaKursPage.isErroWrongKnowSourcePresent(),true);
    }






}
