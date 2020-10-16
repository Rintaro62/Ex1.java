package FindAnimeFoundTest;

import PageObject.FindAnimeInitPage;
import PageObject.LittresInitPage;
import org.testng.annotations.Test;

public class FATest extends FABase{
    @Test
    public void tostart () {
        getDriver().get("https://findanime.net/");
        getDriver().manage().window().maximize();
        FindAnimeInitPage search = new FindAnimeInitPage(getDriver());

        search.clickTextArea();
        search.setSearchText("Fullmetal alchemist");
        search.clickSubmitSearch();
    }
}
