package tests;

import org.springframework.context.annotation.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.DashBoardScreen;
import screens.MapScreen;
import util.tests.BaseMobileTest;

public class NavigationTest extends BaseMobileTest {

    /**
     * Validate Map Screen Navigation.
     */
    @Description(value = "Map screen Navigation test")
    @Test()
    public void navigateToMapScreen() {
        log.info("Start Navigation to Map Screen");
        DashBoardScreen dashBoard = loadDashBoardScreen();
        dashBoard.skipWelcome();
        MapScreen map = dashBoard.goToMapScreen();

        log.info("Validate Show List Button");
        Assert.assertTrue(map.showListIsDisplayed(), "Show List not displayed");

        log.info("Validate Category Button");
        Assert.assertTrue(map.categoryIsDisplayed(), "Category not displayed");

        log.info("Validate Filter Button");
        Assert.assertTrue(map.filterIsDisplayed(), "Filter not displayed");

        log.info("Validate attractions is default option");
        Assert.assertEquals(map.getCategoryDefault(), "Attractions");

        map.tapCategories();

        log.info("Validate hotels categories");
        Assert.assertTrue(map.hotelsIsVisible(), "Hotels nos visible");

        log.info("Validate categories are different");
        Assert.assertTrue(map.categoriesAreDifferent(), "Categories are equals");
    }

}
