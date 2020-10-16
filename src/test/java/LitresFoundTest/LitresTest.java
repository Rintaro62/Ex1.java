package LitresFoundTest;

import PageObject.InitPage;
import PageObject.LittresInitPage;
import org.testng.annotations.Test;

public class LitresTest extends LitresBase{
    @Test
    public void tostart () {
        getDriver().get("https://www.litres.ru/");
        getDriver().manage().window().maximize();
        LittresInitPage search = new LittresInitPage(getDriver());

        search.clickTextArea();
        search.setSearchText("Пехов");
        search.clickSubmitSearch();
    }
}
