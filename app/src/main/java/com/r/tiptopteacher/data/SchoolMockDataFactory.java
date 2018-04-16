package com.r.tiptopteacher.data;

import com.r.tiptopteacher.domain.School;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Who Dat on 4/2/2018.
 * The purpose of this class is to create mock date
 * for all the necessary com.r.tiptopteacher.domain objects
 */
@Module
public class SchoolMockDataFactory {

    @Inject
    public SchoolMockDataFactory(){}

    @Provides
    public SchoolMockDataFactory getSchoolMockDataFactory(){
        return new SchoolMockDataFactory();
    }

    //--- a list of 20 schools
    @Provides
    public List<School> getAListOfSchools(){
        List<School> mockSchoolList = new ArrayList<>();

        // create a list of schools

        School school1 = new School.Builder().schoolId(1).schoolName("Panther Elementary").schoolType("Elementary")
                .districtName("Feline District").schoolCounty("Wild County").build();
        School school2 = new School.Builder().schoolId(2).schoolName("Mountain High Schol").schoolType("High School")
                .districtName("Harry District").schoolCounty("Stanthom County").build();
        School school3 = new School.Builder().schoolId(3).schoolName("LarryVille Middle School").schoolType("Middle School")
                .districtName("Gonlar District").schoolCounty("Gonlar County").build();
        School school4 = new School.Builder().schoolId(4).schoolName("Donttor Academy").schoolType("k - 12")
                .districtName("Areba District").schoolCounty("Greenfield County").build();
        School school5 = new School.Builder().schoolId(5).schoolName("Toronto Elementary").schoolType("Elementary")
                .districtName("8 District").schoolCounty("Jinks County").build();
        School school6 = new School.Builder().schoolId(6).schoolName("Kodulso Elementary").schoolType("Elementary")
                .districtName("Pyramid District").schoolCounty("Falafel County").build();
        School school7 = new School.Builder().schoolId(7).schoolName("Penn Station High").schoolType("High School")
                .districtName("Penn District").schoolCounty("Penn County").build();
        School school8 = new School.Builder().schoolId(8).schoolName("Run Flash").schoolType("Middle School")
                .districtName("Mariachi District").schoolCounty("Horm County").build();
        School school9 = new School.Builder().schoolId(9).schoolName("Ostrich").schoolType("Pre-k")
                .districtName("Willing District").schoolCounty("Wakeing County").build();
        School school10 = new School.Builder().schoolId(10).schoolName("Chocoret High").schoolType("High School")
                .districtName("Pyramid District").schoolCounty("Egypt County").build();
        School school11 = new School.Builder().schoolId(11).schoolName("Tick Elementary").schoolType("Elementary")
                .districtName("Tack District").schoolCounty("Toe County").build();
        School school12 = new School.Builder().schoolId(12).schoolName("ArrowHead Elementary").schoolType("Elementary")
                .districtName("Whead District").schoolCounty("Whead County").build();
        School school13 = new School.Builder().schoolId(13).schoolName("Tolveer Elementary").schoolType("Elementary")
                .districtName("Burrow District").schoolCounty("Kingmirr County").build();
        School school14 = new School.Builder().schoolId(14).schoolName("Best Elementary").schoolType("Elementary")
                .districtName("Minula District").schoolCounty("Delimmer County").build();
        School school15 = new School.Builder().schoolId(15).schoolName("Patron High").schoolType("High School")
                .districtName("Winner District").schoolCounty("Greenfield County").build();
        School school16 = new School.Builder().schoolId(16).schoolName("Infinite Small Academy").schoolType("K - 8")
                .districtName("Copper District").schoolCounty("Mineral County").build();
        School school17 = new School.Builder().schoolId(17).schoolName("krakker High").schoolType("High School")
                .districtName("Reha District").schoolCounty("Bilitate County").build();
        School school18 = new School.Builder().schoolId(18).schoolName("Fiji Elementary").schoolType("Elementary")
                .districtName("Aquarius District").schoolCounty("Zodiac County").build();
        School school19 = new School.Builder().schoolId(19).schoolName("Gaslot Middle").schoolType("Middle School")
                .districtName("Winner District").schoolCounty("Greenfield County").build();
        School school20 = new School.Builder().schoolId(20).schoolName("TP Elementary").schoolType("Elementary")
                .districtName("Tangipahoa District").schoolCounty("Tangipahoa County").build();

        mockSchoolList.add(school1);mockSchoolList.add(school2);mockSchoolList.add(school3);mockSchoolList.add(school4);
        mockSchoolList.add(school5);mockSchoolList.add(school6);mockSchoolList.add(school7);mockSchoolList.add(school8);
        mockSchoolList.add(school9);mockSchoolList.add(school10);mockSchoolList.add(school11);mockSchoolList.add(school12);
        mockSchoolList.add(school13);mockSchoolList.add(school14);mockSchoolList.add(school15);mockSchoolList.add(school16);
        mockSchoolList.add(school17);mockSchoolList.add(school18);mockSchoolList.add(school19);mockSchoolList.add(school20);

        return mockSchoolList;
    }
}
