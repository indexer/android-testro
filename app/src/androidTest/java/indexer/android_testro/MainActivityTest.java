package indexer.android_testro;

import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.IsNot.not;

/**
 * Created by indexer on 7/30/16.
 */
@RunWith(AndroidJUnit4.class) public class MainActivityTest {
  @Rule public final ActivityRule<MainActivity> mMainActivityActivityRule =
      new ActivityRule<>(MainActivity.class);

  @Test public void shouldMainScreenText() {
    onView(withText("Hello World")).check(matches(isDisplayed()));
  }

  @Test public void buttonClickAndViewVisible() {
    onView(withId(R.id.btn_toast)).perform(click()).check(matches(isDisplayed()));
  }

  @Test public void buttonClickAndViewEnable() {
    onView(withId(R.id.btn_toast)).perform(click()).check(matches(not(isEnabled())));
  }
}
