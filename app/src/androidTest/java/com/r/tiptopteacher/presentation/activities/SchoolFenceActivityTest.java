package com.r.tiptopteacher.presentation.activities;

import android.support.test.espresso.contrib.RecyclerViewActions;
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

    @Test
    public void testUserScrollingSchoolResultsRecyclerView(){

        try {
            onView(withId(R.id.rvSchools)).perform(RecyclerViewActions.scrollToPosition(19));
            Thread.sleep(1000);
            onView(withId(R.id.rvSchools)).perform(RecyclerViewActions.scrollToPosition(1));
            Thread.sleep(2000);
            onView(withId(R.id.rvSchools)).perform(RecyclerViewActions.scrollToPosition(17));
            Thread.sleep(1000);
            onView(withId(R.id.rvSchools)).perform(RecyclerViewActions.scrollToPosition(4));
            Thread.sleep(3000);
            onView(withId(R.id.rvSchools)).perform(RecyclerViewActions.scrollToPosition(19));
            Thread.sleep(500);
            onView(withId(R.id.rvSchools)).perform(RecyclerViewActions.scrollToPosition(15));
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}