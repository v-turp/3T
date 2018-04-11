package com.r.tiptopteacher.domain;

import com.r.tiptopteacher.data.SchoolMockDataFactory;

import dagger.Component;

/**
 * Created by Who Dat on 4/10/2018.
 */

@Component (modules = SchoolMockDataFactory.class)
public interface Detention{

    School getSchool();

    SchoolMockDataFactory getSchoolMockDataFactory();

}
