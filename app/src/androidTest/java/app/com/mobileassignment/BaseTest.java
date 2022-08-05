package app.com.mobileassignment;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

public class BaseTest {
    public static void checkElement (Integer resourceId){
        onView(allOf(withId(resourceId), isDisplayed()));
    }

    public static void performText (Integer resourceId, String inputText){
        onView(withId(resourceId))
                .perform(typeText(inputText))
                .check(matches(withText(inputText)));

    }

}
