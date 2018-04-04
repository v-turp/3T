package com.r.tiptopteacher.data;

import com.r.tiptopteacher.domain.School;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Who Dat on 4/2/2018.
 * The purpose of this class is to create mock date
 * for all the necessary com.r.tiptopteacher.domain objects
 */

public class SchoolMockDataFactory {


    //--- a list of 10 schools
    public static List<School> getAListOfSchools(){
        List<School> mockSchoolList = new ArrayList<>();

        // create a list of schools

        School school1 = new School.Builder().schoolId(5).schoolName("Best Elementary").schoolType("Elementary")
                .districtName("Winner District").schoolCounty("Greenfield County").build();
        School school2 = new School.Builder().schoolId(5).schoolName("Best Elementary").schoolType("Elementary")
                .districtName("Winner District").schoolCounty("Greenfield County").build();
        School school3 = new School.Builder().schoolId(5).schoolName("Best Elementary").schoolType("Elementary")
                .districtName("Winner District").schoolCounty("Greenfield County").build();
        School school4 = new School.Builder().schoolId(5).schoolName("Best Elementary").schoolType("Elementary")
                .districtName("Winner District").schoolCounty("Greenfield County").build();
        School school5 = new School.Builder().schoolId(5).schoolName("Best Elementary").schoolType("Elementary")
                .districtName("Winner District").schoolCounty("Greenfield County").build();
        School school6 = new School.Builder().schoolId(5).schoolName("Best Elementary").schoolType("Elementary")
                .districtName("Winner District").schoolCounty("Greenfield County").build();
        School school7 = new School.Builder().schoolId(5).schoolName("Best Elementary").schoolType("Elementary")
                .districtName("Winner District").schoolCounty("Greenfield County").build();
        School school8 = new School.Builder().schoolId(5).schoolName("Best Elementary").schoolType("Elementary")
                .districtName("Winner District").schoolCounty("Greenfield County").build();
        School school9 = new School.Builder().schoolId(5).schoolName("Best Elementary").schoolType("Elementary")
                .districtName("Winner District").schoolCounty("Greenfield County").build();
        School school10 = new School.Builder().schoolId(5).schoolName("Best Elementary").schoolType("Elementary")
                .districtName("Winner District").schoolCounty("Greenfield County").build();
        School school11 = new School.Builder().schoolId(5).schoolName("Best Elementary").schoolType("Elementary")
                .districtName("Winner District").schoolCounty("Greenfield County").build();
        School school12 = new School.Builder().schoolId(5).schoolName("Best Elementary").schoolType("Elementary")
                .districtName("Winner District").schoolCounty("Greenfield County").build();
        School school13 = new School.Builder().schoolId(5).schoolName("Best Elementary").schoolType("Elementary")
                .districtName("Winner District").schoolCounty("Greenfield County").build();
        School school14 = new School.Builder().schoolId(5).schoolName("Best Elementary").schoolType("Elementary")
                .districtName("Winner District").schoolCounty("Greenfield County").build();
        School school15 = new School.Builder().schoolId(5).schoolName("Best Elementary").schoolType("Elementary")
                .districtName("Winner District").schoolCounty("Greenfield County").build();
        School school16 = new School.Builder().schoolId(5).schoolName("Best Elementary").schoolType("Elementary")
                .districtName("Winner District").schoolCounty("Greenfield County").build();
        School school17 = new School.Builder().schoolId(5).schoolName("Best Elementary").schoolType("Elementary")
                .districtName("Winner District").schoolCounty("Greenfield County").build();
        School school18 = new School.Builder().schoolId(5).schoolName("Best Elementary").schoolType("Elementary")
                .districtName("Winner District").schoolCounty("Greenfield County").build();
        School school19 = new School.Builder().schoolId(5).schoolName("Best Elementary").schoolType("Elementary")
                .districtName("Winner District").schoolCounty("Greenfield County").build();
        School school20 = new School.Builder().schoolId(5).schoolName("Best Elementary").schoolType("Elementary")
                .districtName("Winner District").schoolCounty("Greenfield County").build();

        mockSchoolList.add(school1);mockSchoolList.add(school2);mockSchoolList.add(school3);mockSchoolList.add(school4);
        mockSchoolList.add(school5);mockSchoolList.add(school6);mockSchoolList.add(school7);mockSchoolList.add(school8);
        mockSchoolList.add(school9);mockSchoolList.add(school10);mockSchoolList.add(school11);mockSchoolList.add(school12);
        mockSchoolList.add(school13);mockSchoolList.add(school14);mockSchoolList.add(school15);mockSchoolList.add(school16);
        mockSchoolList.add(school7);mockSchoolList.add(school18);mockSchoolList.add(school19);mockSchoolList.add(school20);

        return mockSchoolList;
    }
}
