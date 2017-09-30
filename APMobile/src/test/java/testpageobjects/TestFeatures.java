package testpageobjects;

import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobjects.Features;

public class TestFeatures extends MobileAPI {

//    @Test
//    public void testTopNewsButton() throws InterruptedException {
//        Features topNews = PageFactory.initElements(ad, Features.class);
//        topNews.setTopNews();
//    }
//
//    @Test
//    public void testSearchButton() throws InterruptedException {
//        Features search = PageFactory.initElements(ad, Features.class);
//        search.setSearchButton("Selenium");
//    }

    @Test
    public void testAPHomeButton() throws InterruptedException {
        Features home = PageFactory.initElements(ad, Features.class);
        home.setApHomeButton("", "sports", "", "", "", "", "", "", "",
                "", "", "", "", "", "", "", "");
    }
}