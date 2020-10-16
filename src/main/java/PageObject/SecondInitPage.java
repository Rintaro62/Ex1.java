package PageObject;

import PObject.BasePO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondInitPage extends BasePO {
    public SecondInitPage(WebDriver driver) { super(driver); }
    @FindBy(xpath = ".//input[@aria-label='Запрос']")
    private WebElement setSearchText;
    @FindBy(xpath = ".//div[@class='search2__button']")
    private WebElement submitSearch;



   public void setSearchText(String text) {
        setText(setSearchText, text);
   }


   public void clickSubmitSearch(){
        click(submitSearch);
   }
}
