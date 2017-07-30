package contactsTest;

import org.junit.Test;
import parentTest.ParentTest;

/**
 * Created by tatyanavolkorezova on 30.07.17.
 */
public class ContactsTest extends ParentTest {
    @Test
    public void sendValidContacts(){
        contactsPage.openContactPage();
        contactsPage.enterContactName("WWWWWWWW");
        contactsPage.enterEmail("qqqq@qqq.com");
        contactsPage.enterTheme("Theme Theme");
        contactsPage.enterMessage("Message Contact message");
        contactsPage.checkBoxCopyToMe();
        contactsPage.clickOnSendMessBtn();
        checkAC("Message wasn't sent", contactsPage.checkIsThnxAlertIsPresent(),true);
    }

    

}
