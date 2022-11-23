package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import util.screens.BaseScreen;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;

/**
 * DashBoard screen.
 *
 * @author Hans.Marquez
 */
public class DashBoardScreen extends BaseScreen {

    /**
     * Constructor method.
     *
     * @param driver : AndroidDriver
     * @author Hans.Marquez
     */
    public DashBoardScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"dismiss-icon\")")
    private AndroidElement dismissPreferenceUpdateButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").textContains(\"Welcome to Disney Genie Service!\")")
    private AndroidElement dismissWelcome;

    //@HowToUseLocators(androidAutomation = ALL_POSSIBLE)
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*tab_icon\").descriptionContains(\"Map\")")
    private AndroidElement mapButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceIdMatches(\".*tab_icon\").descriptionContains(\"More\")")
    private AndroidElement otherOptionsBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Buy Tickets and Passes\")")
    private AndroidElement plansBtn;

  @AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Check Dining Availability\")")
  private AndroidElement reservationBtn;


    /**
     * @author Hans.Marquez
     * Navigate to Log in Screen from DashBoard Screen.
     */

    public void skipWelcome() {
        if (this.isElementAvailable(dismissWelcome, 25)) {
            click(dismissPreferenceUpdateButton);
        }
    }
    public MapScreen goToMapScreen() {
        skipWelcome();
        click(mapButton);
        return new MapScreen(driver);
    }

    public ScreenOptions otherOptionsScreen() {
        skipWelcome();
        click(otherOptionsBtn);
        return new ScreenOptions(driver);
    }

    public void clickAddPlans() {
        click(plansBtn);
    }

    public boolean addPlansIsVisible() {
        return isElementAvailable(plansBtn);
    }

    public boolean reservationIsVisible() {
        return  isElementAvailable(reservationBtn);
    }


}
