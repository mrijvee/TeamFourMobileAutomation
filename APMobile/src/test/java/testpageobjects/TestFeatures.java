package testpageobjects;

import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobjects.Features;

public class TestFeatures extends MobileAPI {

    @Test
    public void testTopNews() {
        Features topNews = PageFactory.initElements(ad, Features.class);
        topNews.setTopNews();
    }

}
