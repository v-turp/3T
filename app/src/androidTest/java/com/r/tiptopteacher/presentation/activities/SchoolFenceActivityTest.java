package com.r.tiptopteacher.presentation.activities;

import android.support.test.rule.ActivityTestRule;

import com.r.tiptopteacher.R;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by Who Dat on 4/4/2018.
 */
public class SchoolFenceActivityTest {
    @Rule
    public ActivityTestRule<SchoolFenceActivity> schoolFenceActivityTestRule =
            new ActivityTestRule<>(SchoolFenceActivity.class);

    @Test
    public void testButtonClick(){
        onView(withId(R.id.btnSearch)).perform(click());
    }
}