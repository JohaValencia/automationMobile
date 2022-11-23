package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.aspectj.weaver.ast.And;
import util.screens.BaseScreen;

public class PrivacyAndLegacyScreen extends BaseScreen {

    public PrivacyAndLegacyScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.TextView).textContains(\"Privacy & Legal\")")
    private AndroidElement title;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.TextView).textContains(\"Privacy Policy\")")
    private AndroidElement privacyPolicy;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.TextView).textContains(\"Terms of Use\")")
    private AndroidElement termsOfUse;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.TextView).textContains(\"Supplemental\")")
    private AndroidElement supplemental;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.TextView).textContains(\"Electronic\")")
    private AndroidElement electronic;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.TextView).textContains(\"Property Rules\")")
    private AndroidElement propertyRules;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.TextView).textContains(\"Legal Notices\")")
    private AndroidElement legalNotices;

public boolean titleIsVisible() {
    return isElementAvailable(title);
}

public boolean privacyPolicyIsVisible() {
    return isElementAvailable(privacyPolicy);
}

public boolean termsOfUseIsVisible() {
    return isElementAvailable(termsOfUse);
}

public boolean supplementalIsVisible() {
    return isElementAvailable(supplemental);
}

public boolean ElectronicIsVisible() {
    return isElementAvailable(electronic);
}

public boolean propertyRulesIsVisible() {
    return isElementAvailable(propertyRules);
}

public boolean legalNoticesIsVisible() {
    return isElementAvailable(legalNotices);
}
}
