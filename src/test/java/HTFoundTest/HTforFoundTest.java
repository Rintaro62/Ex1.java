package HTFoundTest;

import PageObject.SecondInitPage;
import org.testng.annotations.Test;

public class HTforFoundTest extends BaseForTest {
    @Test
    public void start () {
        getDriver().get("https://yandex.ru/");
        getDriver().manage().window().maximize();
        SecondInitPage found = new SecondInitPage(getDriver());


        found.setSearchText("довод");
        found.clickSubmitSearch();


    }
}
