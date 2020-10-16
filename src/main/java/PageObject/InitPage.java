package PageObject;

import PObject.BasePO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InitPage extends BasePO {

    public InitPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = ".//input[@title='Поиск']")
    private WebElement setSearchText;

    @FindBy(xpath = "(.//input[@value='Поиск в Google'])[1]")
    private WebElement submitSearch;



    public void setSearchText(String text) {
        setText(setSearchText, text);
    }


    public void clickSubmitSearch(){
        click(submitSearch);
    }

}
