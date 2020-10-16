package ForSilenoid;

import PageObject.InitPage;
import org.testng.annotations.Test;

public class OneTest extends Base {
    @Test
    public void start () {
        getDriver().get("https://www.google.ru/");
        getDriver().manage().window().maximize();
        InitPage in = new InitPage(getDriver());

        in.setSearchText("Привет");
        in.clickSubmitSearch();


    }
}
