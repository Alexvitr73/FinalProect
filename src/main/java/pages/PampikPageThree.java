package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PampikPageThree extends BasePage {
    public PampikPageThree(WebDriver driver) {
        super(driver);
    }

    private static class Locators {
        //            Test 1
        private final static By inputNumberPhone = By.xpath("//input[@placeholder='Телефон']");
        private final static By inputPassword = By.xpath("//input[@placeholder='Пароль']");
    }

    private static class Labels {
        //            Test 1
        private final static String url3 = "https://pampik.com/ua/account/login";
        private final static String phoneNumber = "500000000";
    }
    //       Methods
    //      Test 1
    public void openPage() {
        driver.get(Labels.url3);
    }

    public void phoneNumberFieldClick() {
        elements.clickOnElement(PampikPageThree.Locators.inputNumberPhone);
    }

}