package com.r.tiptopteacher.domain;

import org.junit.After;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by Who Dat on 4/3/2018.
 */

public class SchoolBuilderTest {

    private School school;

    @Test
    public void builderShouldBuildASchoolObject(){
        School theSchool = new School.Builder().build();
        assertNotNull("School object is null", theSchool);
    }

    @Test
    public void builderShouldAddASchoolID(){
        school = new School.Builder().schoolId(5).build();
        assertEquals("School ID is incorrect", 5, school.getSchoolID() );
    }

    @After
    public void tearDown(){
        school = null;
    }
}
