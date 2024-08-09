package by.mts.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MtsHomePage {

    private WebDriver driver;

    public MtsHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[contains(@class, 'cookie')]")
    private WebElement cookieBanner;

    @FindBy(xpath = "//*[contains(@id, 'cookie-agree')]")
    private WebElement acceptCookiesButton;

    @FindBy(xpath = "//*[contains(@class, 'select__header')]")
    private WebElement serviceDropdown;

    @FindBy(xpath = "//*[contains(@class, 'select__now')]")
    private WebElement currentService;

    @FindBy(xpath = "//*[contains(@class, 'select__item')]")
    private List<WebElement> serviceOptions;

    @FindBy(xpath = "//*[contains(@id, 'connection-phone')]")
    private WebElement connectionPhone;

    @FindBy(xpath = "//*[contains(@id, 'connection-sum')]")
    private WebElement connectionSum;

    @FindBy(xpath = "//*[contains(@id, 'connection-email')]")
    private WebElement connectionEmail;

    @FindBy(xpath = "//*[contains(@id, 'internet-phone')]")
    private WebElement internetPhone;

    @FindBy(xpath = "//*[contains(@id, 'internet-sum')]")
    private WebElement internetSum;

    @FindBy(xpath = "//*[contains(@id, 'internet-email')]")
    private WebElement internetEmail;

    @FindBy(xpath = "//*[contains(@id, 'score-instalment')]")
    private WebElement scoreInstalment;

    @FindBy(xpath = "//*[contains(@id, 'instalment-sum')]")
    private WebElement instalmentSum;

    @FindBy(xpath = "//*[contains(@id, 'instalment-email')]")
    private WebElement instalmentEmail;

    @FindBy(xpath = "//*[contains(@id, 'score-arrears')]")
    private WebElement scoreArrears;

    @FindBy(xpath = "//*[contains(@id, 'arrears-sum')]")
    private WebElement arrearsSum;

    @FindBy(xpath = "//*[contains(@id, 'arrears-email')]")
    private WebElement arrearsEmail;

    @FindBy(xpath = "//button[text()='Продолжить']")
    private WebElement continueButton;

    @FindBy(xpath = "//*[contains(@class, 'bepaid-app')]")
    private WebElement bePaidApp;

    public void acceptCookiesIfPresent() {
        if (cookieBanner.isDisplayed()) {
            acceptCookiesButton.click();
        }
    }

    public void selectService(String serviceName) {
        serviceDropdown.click();
        for (WebElement option : serviceOptions) {
            if (option.getText().equals(serviceName)) {
                option.click();
                break;
            }
        }
    }

    public String getCurrentService() {
        return currentService.getText();
    }

    public String getConnectionPhonePlaceholder() {
        return connectionPhone.getAttribute("placeholder");
    }

    public String getConnectionSumPlaceholder() {
        return connectionSum.getAttribute("placeholder");
    }

    public String getConnectionEmailPlaceholder() {
        return connectionEmail.getAttribute("placeholder");
    }

    public String getInternetPhonePlaceholder() {
        return internetPhone.getAttribute("placeholder");
    }

    public String getInternetSumPlaceholder() {
        return internetSum.getAttribute("placeholder");
    }

    public String getInternetEmailPlaceholder() {
        return internetEmail.getAttribute("placeholder");
    }

    public String getScoreInstalmentPlaceholder() {
        return scoreInstalment.getAttribute("placeholder");
    }

    public String getInstalmentSumPlaceholder() {
        return instalmentSum.getAttribute("placeholder");
    }

    public String getInstalmentEmailPlaceholder() {
        return instalmentEmail.getAttribute("placeholder");
    }

    public String getScoreArrearsPlaceholder() {
        return scoreArrears.getAttribute("placeholder");
    }

    public String getArrearsSumPlaceholder() {
        return arrearsSum.getAttribute("placeholder");
    }

    public String getArrearsEmailPlaceholder() {
        return arrearsEmail.getAttribute("placeholder");
    }

    public void enterDataForConnection(String phoneNumber, String amount) {
        connectionPhone.clear();
        connectionPhone.sendKeys(phoneNumber);
        connectionSum.clear();
        connectionSum.sendKeys(amount);
        continueButton.click();
    }

    public boolean isBePaidAppDisplayed() {
        return bePaidApp.isDisplayed();
    }
}

