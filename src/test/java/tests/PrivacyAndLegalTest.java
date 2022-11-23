package tests;

import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DashBoardScreen;
import screens.PrivacyAndLegacyScreen;
import screens.ScreenOptions;
import util.tests.BaseMobileTest;

public class PrivacyAndLegalTest extends BaseMobileTest {

    @Description("Privacy and legal test")
    @Test
    public void privacyAndLegalTest() {
        log.info("Dismissed tutorial");
        DashBoardScreen dashboard = loadDashBoardScreen();
        log.info("Searching to more options screen");
        ScreenOptions more = dashboard.otherOptionsScreen();

        log.info("validate tickets and passes");
        Assert.assertTrue(more.ticketsIsDisplayed());

        more.privacyAndLegacySwipe();

        log.info("Validate all categories are not equal");
        Assert.assertTrue(more.areDifferentCategories());

        log.info("Privacy and legal screen");
        PrivacyAndLegacyScreen privacyAndLegal = more.goToPrivacyAndLegacy();

        log.info("Validate P&L screen is visible");
        Assert.assertTrue(privacyAndLegal.titleIsVisible());

        log.info("Validate Privacy policy is visible");
        Assert.assertTrue(privacyAndLegal.privacyPolicyIsVisible());

        log.info("Validate supplemental terms is visible");
        Assert.assertTrue(privacyAndLegal.supplementalIsVisible());

        log.info("Legal notices option is visible");
        Assert.assertTrue(privacyAndLegal.legalNoticesIsVisible());

        log.info("Property rules is visible");
        Assert.assertTrue(privacyAndLegal.propertyRulesIsVisible());

        log.info("Electronic communication is visible");
        Assert.assertTrue(privacyAndLegal.ElectronicIsVisible());


    }
}
