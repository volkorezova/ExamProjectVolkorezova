package pages;

import libs.ActionWithElements;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.is;

/**
 * Created by tatyanavolkorezova on 23.07.17.
 */
public class ParentPage {
    WebDriver webDriver;
    Logger logger;
    ActionWithElements actionWithElements;


    public ParentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        logger = Logger.getLogger(getClass());
        actionWithElements= new ActionWithElements(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    /**
     * Method opens url
     *
     * @param url
     */

    public void open(String url) {

        try {

            webDriver.get(url);
            logger.info("Page was opened " + url);

        } catch (Exception e) {
            logger.error("Page cannot opened " + url);
            Assert.fail("Page cannot opened " + url);

        }
    }


    public void checkTitle(String expectedTitle) {

        try {
            Assert.assertThat("Title not matched", webDriver.getTitle(), is(expectedTitle));

        } catch (Exception e) {
            logger.error("Cannot work with page");
            Assert.fail("Cannot work with page");
        }

    }

    public void checkTitleH1PresentOnPageWithText(String text) {

        actionWithElements.checkTextInElement(".//H1", text);
    }
}
