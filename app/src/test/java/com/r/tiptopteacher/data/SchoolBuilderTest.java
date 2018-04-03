package com.r.tiptopteacher.data;

import com.r.tiptopteacher.domain.School;

import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by Who Dat on 4/3/2018.
 */

public class SchoolBuilderTest {

    @Test
    public void builderShouldBuildASchoolObject(){
        School theSchool = new School.Builder().build();
        assertNotNull("School object is null", theSchool);
    }
}
