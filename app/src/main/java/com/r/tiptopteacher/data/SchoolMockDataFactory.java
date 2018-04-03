package com.r.tiptopteacher.data;

import com.r.tiptopteacher.domain.School;

/**
 * Created by Who Dat on 4/2/2018.
 * The purpose of this class is to create mock date
 * for all the necessary com.r.tiptopteacher.domain objects
 */

public class SchoolMockDataFactory {

    private static SchoolMockDataFactory mockDataFactory;

    public static SchoolMockDataFactory getInstance(){
        if(null==mockDataFactory){
            return mockDataFactory;
        }
        return mockDataFactory;
    }


    public School getSchool9(){
        return new School.Builder()
                            .schoolId(5)
                            .schoolName("Best Elementary")
                            .schoolType("Elementary")
                            .districtName("Winner District")
                            .schoolCounty("Greenfield County")
                            .build();
    }
}
