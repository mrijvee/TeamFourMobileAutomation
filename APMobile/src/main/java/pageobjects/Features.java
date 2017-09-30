package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Features {

    @FindBy(id = "mnn.Android:id/menu_search")
    WebElement topNewsClick;

    public void setTopNews() {
        topNewsClick.click();
    }

}
