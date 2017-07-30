package parentTest;

import libs.Utils;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ContactsPage;
import pages.ZapisNaKursPage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by tatyanavolkorezova on 23.07.17.
 */

    public class ParentTest {

    public WebDriver webDriver;
    private Logger logger = Logger.getLogger(getClass());
    private Utils utils = new Utils();
    private String pathToScreenShot;

    private boolean isTestPass = false;
    public ZapisNaKursPage zapisNaKursPage;
    public ContactsPage contactsPage;


    public ParentTest() {
    }

    @Rule
    public TestName testName = new TestName();

    @Before
    public void setUp(){
        File file = new File("");
        pathToScreenShot = file.getAbsolutePath() + "/target/screenshots/"
                + this.getClass().getPackage().getName()+"/"
                + this.getClass().getSimpleName() + "/" + this.testName.getMethodName()+".jpg";

        File fileFF = new File("./macDrivers/chromedriver");
        System.setProperty("webdriver.chrome.driver", fileFF.getAbsolutePath());
        //open browser
        webDriver= new ChromeDriver();
        //maximize window
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        zapisNaKursPage=new ZapisNaKursPage(webDriver);
        contactsPage = new ContactsPage(webDriver);


    }

        @After
        public void tearDown() {
            if (!(webDriver==null)){
                if (!isTestPass) {
                    utils.screenShot(pathToScreenShot, webDriver);
                }
                webDriver.quit();
            }
        }

        public void checkAC(String message, boolean actualResult, boolean expectedResult){
            Assert.assertThat(message, actualResult, is (expectedResult));
            setTestPass();

        }

    private void setTestPass() {
        isTestPass=true;
    }

    }


