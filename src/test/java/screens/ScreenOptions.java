package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import util.screens.BaseScreen;

import java.util.ArrayList;
import java.util.List;

public class ScreenOptions extends BaseScreen {

    public ScreenOptions(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.TextView).textContains(\"Tickets\")")
    private AndroidElement tickets;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.TextView).textContains(\"Privacy\")")
    private AndroidElement privacyAndLegacyBtn;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.disney.wdpro.dlr:id/content\")")
    private List<AndroidElement> categories;

    public boolean ticketsIsDisplayed() {
        return isElementAvailable(tickets);
    }

    public boolean privacyAndLegacyIsDisplayed() {
        return isElementAvailable(privacyAndLegacyBtn);
    }

    public void privacyAndLegacySwipe() {
        int counter = 0;
        while(!privacyAndLegacyIsDisplayed() && counter <=5){
            swipeDown();
            counter++;
        }
    }

    public boolean areDifferentCategories() {
        List<String> partialCategories = new ArrayList<>();
        for (AndroidElement i: categories) {
            String category = i.getText();
            partialCategories.add(category);
        } return partialCategories.stream().distinct().count() == partialCategories.size();
    }

    public PrivacyAndLegacyScreen goToPrivacyAndLegacy() {
        click(privacyAndLegacyBtn);
        return new PrivacyAndLegacyScreen(driver);
    }
}
