package my.company.tests;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.qameta.allure.Issue;
import io.qameta.allure.TmsLink;
import my.company.steps.WebDriverSteps;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 28.10.13
 */
public class SearchTest {

    private WebDriverSteps steps;

    @Before
    public void setUp() throws Exception {
        ChromeDriverManager.getInstance().setup();
        steps = new WebDriverSteps(new ChromeDriver());
    }

    @Test
    @TmsLink("TC-1")
    public void searchTest() throws Exception {
        steps.openMainPage();
        steps.search("Allure framework");
        steps.makeScreenShot();
        steps.quit();
    }
}

