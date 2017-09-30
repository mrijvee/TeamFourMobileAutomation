package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Features {

    @FindBy(id = "mnn.Android:id/actionBarTextViewTitle")
    WebElement topNewsButton;
    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Search\"]\n")
    WebElement searchButton;
    @FindBy(id = "android:id/search_src_text")
    WebElement searchText;
    @FindBy(id = "android:id/home")
    WebElement apHomeButton;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[2]")
    WebElement topNews;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[2]")
    WebElement sports;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[2]")
    WebElement entertainment;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[4]/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[2]")
    WebElement usNews;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[5]/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[2]")
    WebElement world;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[6]/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[2]")
    WebElement business;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[7]/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[2]")
    WebElement oddities;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[8]/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[2]")
    WebElement politics;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[9]/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[2]")
    WebElement photoGallery;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[10]/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[2]")
    WebElement videoGallery;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[11]/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[2]")
    WebElement technology;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[12]/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[2]")
    WebElement lifestyle;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[13]/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[2]")
    WebElement travel;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[14]/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[2]")
    WebElement healthAndScience;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[15]/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[2]")
    WebElement religion;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[16]/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[2]")
    WebElement pressReleases;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[17]/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ImageView[2]")
    WebElement addCategory;

    public void setTopNews() throws InterruptedException {
        topNewsButton.click();
        Thread.sleep(3000);
    }

    public void setSearchButton(String inputSearch) throws InterruptedException {
        searchButton.click();
        Thread.sleep(2000);
        searchText.sendKeys(inputSearch);
        searchButton.click();
    }

    public void setApHomeButton(String setTopNews, String setSports, String setEntertainment, String setUSNews, String setWorld, String setBusiness,
                                String setOddities, String setPolitics, String setPhotoGallery, String setVideoGallery, String setTechnology,
                                String setLifestyle, String setTravel, String setHealthAndScience, String setReligion, String setPressReleases,
                                String setAddCategory) throws InterruptedException {
        apHomeButton.click();
        Thread.sleep(2000);
        if (setTopNews.equalsIgnoreCase(setTopNews)) {
            topNews.click();
            Thread.sleep(2000);
        }
        else if (setSports.equalsIgnoreCase(setSports)) {
            sports.click();
            Thread.sleep(2000);
        }
        else if (setEntertainment.equalsIgnoreCase(setEntertainment)) {
            entertainment.click();
            Thread.sleep(2000);
        }
        else if (setUSNews.equalsIgnoreCase(setUSNews)) {
            usNews.click();
            Thread.sleep(2000);
        }
        else if (setWorld.equalsIgnoreCase(setWorld)) {
            world.click();
            Thread.sleep(2000);
        }
        else if (setBusiness.equalsIgnoreCase(setBusiness)) {
            business.click();
            Thread.sleep(2000);
        }
        else if (setOddities.equalsIgnoreCase(setOddities)) {
            oddities.click();
            Thread.sleep(2000);
        }
        else if (setPolitics.equalsIgnoreCase(setPolitics)) {
            politics.click();
            Thread.sleep(2000);
        }
        else if (setPhotoGallery.equalsIgnoreCase(setPhotoGallery)) {
            photoGallery.click();
            Thread.sleep(2000);
        }
        else if (setVideoGallery.equalsIgnoreCase(setVideoGallery)) {
            videoGallery.click();
            Thread.sleep(2000);
        }
        else if (setTechnology.equalsIgnoreCase(setTechnology)) {
            technology.click();
            Thread.sleep(2000);
        }
        else if (setLifestyle.equalsIgnoreCase(setLifestyle)) {
            lifestyle.click();
            Thread.sleep(2000);
        }
        else if (setTravel.equalsIgnoreCase(setTravel)) {
            travel.click();
            Thread.sleep(2000);
        }
        else if (setHealthAndScience.equalsIgnoreCase(setHealthAndScience)) {
            healthAndScience.click();
            Thread.sleep(2000);
        }
        else if (setReligion.equalsIgnoreCase(setReligion)) {
            religion.click();
            Thread.sleep(2000);
        }
        else if (setPressReleases.equalsIgnoreCase(setPressReleases)) {
            pressReleases.click();
            Thread.sleep(2000);
        }
        else if (setAddCategory.equalsIgnoreCase(setAddCategory)) {
            addCategory.click();
            Thread.sleep(2000);
        }
    }
}