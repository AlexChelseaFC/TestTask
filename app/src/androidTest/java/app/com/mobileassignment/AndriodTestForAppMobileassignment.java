package app.com.mobileassignment;

import static androidx.test.InstrumentationRegistry.getInstrumentation;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;

import androidx.test.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

import app.com.mobileassignment.views.MainActivity;


@RunWith(AndroidJUnit4.class)
public class AndriodTestForAppMobileassignment {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    //1. The check the progress bar can be displayed
    public void checkProgressBarPresence (){
        ProgressBarScreen.checkElement(ProgressBarScreen.getProgressBarElement());
    }

    @Test
    //2. The check the search element can be displayed
    public void checkSearchElementIsPresence (){
        SearchScreen.checkElement(SearchScreen.getSearchElement());
    }

    @Test
    //3. The check cities list can be displayed
    public void checkCitiesListElementIsPresence (){
        SearchScreen.checkElement(SearchScreen.getCitiesListElement());
    }

    @Test
    //4. The check of City name
    public void setSimpleCityName (){
        SearchScreen.checkElement(SearchScreen.getSearchElement());
        SearchScreen.performText(SearchScreen.getSearchElement(),"Vitebsk");
    }

    @Test
    //5.The check InsertPoint is displayed after the entered city name
    public void insertPointPageDisplayed (){
        SearchScreen.checkElement(SearchScreen.getSearchElement());
        SearchScreen.performText(SearchScreen.getSearchElement(),"Vitebsk");
        InsertPointScreen.checkElement(InsertPointScreen.getSearchElement());
    }

    @Test
    //6.The check the entered long city name
    public void setLongSimpleCityName (){
        SearchScreen.checkElement(SearchScreen.getSearchElement());
        SearchScreen.performText(SearchScreen.getSearchElement(),"Llanfair Pwllgwyngyll");
    }

}
