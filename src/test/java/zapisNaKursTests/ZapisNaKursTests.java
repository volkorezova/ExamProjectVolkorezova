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
        zapisNaKursPage.selectElementFromDDTypeOfKursByValue(" Базовый модуль тестирования ПО ( дневная группа)");
      //  zapisNaKursPage.selectElementFromDDByTextTypeKurs(" Базовый модуль тестирования ПО ( дневная группа)");
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
}
