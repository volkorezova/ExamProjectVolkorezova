package zapisNaKursTests;

import org.junit.Test;
import parentTest.ParentTest;

/**
 * Created by tatyanavolkorezova on 30.07.17.
 */
public class ResetFieldsTest extends ParentTest {

    @Test
    public void resetFieldsZapisNaKurs(){
        zapisNaKursPage.openZapisNaKursPage();
       // zapisNaKursPage.clickOnElementDDChooseCource();
       // zapisNaKursPage.selectElementFromDDTypeOfKursByValue(" Базовый модуль тестирования ПО ( дневная группа)");
       // zapisNaKursPage.selectElementFromDDByTextTypeKurs(" Android");
        zapisNaKursPage.selectElementFromDDByIndexKursType(7);
        zapisNaKursPage.enterSurname("Volkorezova");
        zapisNaKursPage.enterName("Tatyna");
        zapisNaKursPage.enterPhone("0665678789");
        zapisNaKursPage.enterEmail("qqq@qqq.com");
        zapisNaKursPage.enterSkype("wwwwwwwww");
      //  zapisNaKursPage.selectElementFromDDKnowSorceByValue(" рекламная листовка/ визитка/ буклет");
        zapisNaKursPage.selectElementFromDDKnowSourceByIndex(6);
        zapisNaKursPage.fillQuestionArea("area area area area aretcccff");
        zapisNaKursPage.clickButtonReset();
        checkAC("Fields aren't cleared", zapisNaKursPage.areAllFieldsAreCleared(),true);



    }
}
