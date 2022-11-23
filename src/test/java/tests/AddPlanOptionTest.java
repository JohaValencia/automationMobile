package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DashBoardScreen;
import util.tests.BaseMobileTest;

public class AddPlanOptionTest extends BaseMobileTest {

    @Test()
    public void addPlanTest () {
        log.info("Navigate to dashboard");
        DashBoardScreen dashBoardScreen = loadDashBoardScreen();
        dashBoardScreen.skipWelcome();



        log.info("Validate is add plans button is visible");
        Assert.assertTrue(dashBoardScreen.addPlansIsVisible());

        dashBoardScreen.clickAddPlans();

        log.info("Validate dinner reservation button is visible");
        Assert.assertTrue(dashBoardScreen.reservationIsVisible());
    }
}
