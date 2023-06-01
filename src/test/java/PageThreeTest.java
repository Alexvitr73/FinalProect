import base.BaseTest;
import org.testng.annotations.Test;

public class PageThreeTest extends BaseTest {
    @Test(priority = 1)
    public void checkEnterIncorrectData() {
        pampikPageThree.openPage();
        pampikPageThree.phoneNumberFieldClick();

    }

}
