package by.mts.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MtsTest extends BaseTest {

    @Test
    public void testPlaceholdersForConnection() {
        String service = "Услуги связи";
        mtsHomePage.selectService(service);
        assertEquals(service, mtsHomePage.getCurrentService());

        assertEquals("Номер телефона", mtsHomePage.getConnectionPhonePlaceholder());
        assertEquals("Сумма", mtsHomePage.getConnectionSumPlaceholder());
        assertEquals("E-mail для отправки чека", mtsHomePage.getConnectionEmailPlaceholder());
    }

    @Test
    public void testPlaceholdersForInternet() {
        String service = "Домашний интернет";
        mtsHomePage.selectService(service);
        assertEquals(service, mtsHomePage.getCurrentService());

        assertEquals("Номер абонента", mtsHomePage.getInternetPhonePlaceholder());
        assertEquals("Сумма", mtsHomePage.getInternetSumPlaceholder());
        assertEquals("E-mail для отправки чека", mtsHomePage.getInternetEmailPlaceholder());
    }

    @Test
    public void testPlaceholdersForInstalment() {
        String service = "Рассрочка";
        mtsHomePage.selectService(service);
        assertEquals(service, mtsHomePage.getCurrentService());

        assertEquals("Номер счета на 44", mtsHomePage.getScoreInstalmentPlaceholder());
        assertEquals("Сумма", mtsHomePage.getInstalmentSumPlaceholder());
        assertEquals("E-mail для отправки чека", mtsHomePage.getInstalmentEmailPlaceholder());
    }

    @Test
    public void testPlaceholdersForArrears() {
        String service = "Задолженность";
        mtsHomePage.selectService(service);
        assertEquals(service, mtsHomePage.getCurrentService());

        assertEquals("Номер счета на 2073", mtsHomePage.getScoreArrearsPlaceholder());
        assertEquals("Сумма", mtsHomePage.getArrearsSumPlaceholder());
        assertEquals("E-mail для отправки чека", mtsHomePage.getArrearsEmailPlaceholder());
    }

    @Test
    public void testBePaidApp() {
        mtsHomePage.enterDataForConnection("297777777", "15");
        String message = "Окно для оплаты не отображается.";
        assertTrue(mtsHomePage.isBePaidAppDisplayed(), message);
    }
}

