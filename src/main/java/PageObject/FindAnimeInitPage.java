package PageObject;

import PObject.BasePO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindAnimeInitPage extends BasePO {
    public FindAnimeInitPage(WebDriver driver) { super(driver); }
    // @FindBy(xpath =".//input[@name=\"q\"]")
    // private WebElement textArea;
    @FindBy(xpath = ".//input[@placeholder=\"Название аниме или автор\"]")
    private  WebElement setSearchText;
   //@FindBy(xpath = ".//input[@id=\"q\"]")
   // private WebElement setSearchText;
    @FindBy(xpath = ".//button[@title=\"Поиск\"]")
    private WebElement submitSearch;

    public void clickTextArea(){
        click(setSearchText);
    }

    public void setSearchText(String text) {
        setText(setSearchText, text);
    }
    public void clickSubmitSearch(){
        click(submitSearch);
    }
}
