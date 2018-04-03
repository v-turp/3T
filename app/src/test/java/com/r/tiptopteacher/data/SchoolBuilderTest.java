package com.r.tiptopteacher.data;

import com.r.tiptopteacher.domain.School;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by Who Dat on 4/3/2018.
 */

public class SchoolBuilderTest {

    School school;

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
}
