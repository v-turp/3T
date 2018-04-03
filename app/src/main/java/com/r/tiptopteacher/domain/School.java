package com.r.tiptopteacher.domain;

import java.util.Date;

/**
 * Created by Who Dat on 4/2/2018.
 */

public class School {

    private int schoolID;
    private int parentId;
    private String schoolName;
    private String districtName;
    private String mailingAddress;
    private String physicalAddress;
    private String phone;
    private String schoolType;
    private String schoolStatus;
    private String charter;
    private String schoolCounty;
    private int countyId;
    private String gradeSpan;
    private int totalStudents;
    private int classroomTeachers;
    private double studentsPerTeacher;
    private String title1School;
    private String title1SchoolWideProgram;
    private String magnet;
    private String locale;
    private String enrollmentByGrade;
    private String enrollmentByRace;
    private String enrollmentByGender;
    private boolean freeLunchEligible;
    private boolean reducedPriceLunchEligible;
    private boolean greatschoolRating;
    private double schoolLat;
    private double schoolLon;
    private String geoJson;
    private String geoSource;
    private double riskRank;
    private String schoolZipcode;
    private int zipId;
    private boolean isPrivateSchool;
    private String comments;
    private Date createdDate;
    private String createdBy;
    private Date modifiedDate;
    private String modifiedBy;
    private boolean active;
    private int districtId;

    private School(School.Builder schoolBuilder){
        this.schoolID = schoolBuilder.schoolId;
        this.parentId = schoolBuilder.parentId;
        this.schoolName = schoolBuilder.schoolName;
        this.districtName = schoolBuilder.districtName;
        this.mailingAddress = schoolBuilder.mailingAddress;
        this.physicalAddress = schoolBuilder.physicalAddress;
        this.phone = schoolBuilder.phone;
        this.schoolType = schoolBuilder.schoolType;
        this.schoolStatus = schoolBuilder.schoolStatus;
        this.charter = schoolBuilder.charter;
        this.schoolCounty = schoolBuilder.schoolCounty;
        this.countyId = schoolBuilder.schoolId;
        this.gradeSpan = schoolBuilder.gradeSpan;
        this.totalStudents = schoolBuilder.totalStudents;
        this.classroomTeachers = schoolBuilder.classroomTeachers;
        this.studentsPerTeacher = schoolBuilder.studentsPerTeacher;
        this.title1School = schoolBuilder.title1School;
        this.title1SchoolWideProgram = schoolBuilder.title1SchoolWideProgram;
        this.magnet = schoolBuilder.magnet;
        this.locale = schoolBuilder.locale;
        this.enrollmentByGrade = schoolBuilder.enrollmentByGrade;
        this.enrollmentByRace = schoolBuilder.enrollmentByRace;
        this.enrollmentByGender = schoolBuilder.enrollmentByGender;
        this.freeLunchEligible = schoolBuilder.freeLunchEligible;
        this.reducedPriceLunchEligible = schoolBuilder.reducedPriceLunchEligible;
        this.greatschoolRating = schoolBuilder.greatschoolRating;
        this.schoolLat = schoolBuilder.schoolLat;
        this.schoolLon = schoolBuilder.schoolLon;
        this.geoJson = schoolBuilder.geoJson;
        this.geoSource = schoolBuilder.geoSource;
        this.riskRank = schoolBuilder.riskRank;
        this.schoolZipcode = schoolBuilder.schoolZipcode;
        this.zipId = schoolBuilder.zipId;
        this.isPrivateSchool = schoolBuilder.isPrivateSchool;
        this.comments = schoolBuilder.comments;
        this.createdDate = schoolBuilder.createdDate;
        this.createdBy = schoolBuilder.createdBy;
        this.modifiedDate = schoolBuilder.modifiedDate;
        this.modifiedBy = schoolBuilder.modifiedBy;
        this.active = schoolBuilder.active;
        this.districtId = schoolBuilder.districtId;
    }

    public static class Builder{

        private int schoolId;
        private int parentId;
        private String schoolName;
        private String districtName;
        private String mailingAddress;
        private String physicalAddress;
        private String phone;
        private String schoolType;
        private String schoolStatus;
        private String charter;
        private String schoolCounty;
        private int countyId;
        private String gradeSpan;
        private int totalStudents;
        private int classroomTeachers;
        private double studentsPerTeacher;
        private String title1School;
        private String title1SchoolWideProgram;
        private String magnet;
        private String locale;
        private String enrollmentByGrade;
        private String enrollmentByRace;
        private String enrollmentByGender;
        private boolean freeLunchEligible;
        private boolean reducedPriceLunchEligible;
        private boolean greatschoolRating;
        private double schoolLat;
        private double schoolLon;
        private String geoJson;
        private String geoSource;
        private double riskRank;
        private String schoolZipcode;
        private int zipId;
        private boolean isPrivateSchool;
        private String comments;
        private Date createdDate;
        private String createdBy;
        private Date modifiedDate;
        private String modifiedBy;
        private boolean active;
        private int districtId;

        public School build(){
            return new School(this);
        }

        public Builder schoolId(int schoolId){
            this.schoolId = schoolId;
            return this;
        }
        public Builder parentId(int parentId){
            this.parentId = parentId;
            return this;
        }
        public Builder schoolName(String schoolName ){
            this.schoolName = schoolName;
            return this;
        }
        public Builder districtName(String districtName ){
            this.districtName = districtName;
            return this;
        }
        public Builder mailingAddress(String mailingAddress){
            this.mailingAddress = mailingAddress;
            return this;
        }
        public Builder physicalAddress(String physicalAddress){
            this.physicalAddress = physicalAddress;
            return this;
        }
        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }
        public Builder schoolType(String schoolType){
            this.schoolType = schoolType;
            return this;
        }
        public Builder schoolStatus(String schoolStatus){
            this.schoolStatus = schoolStatus;
            return this;
        }
        public Builder charter(String charter){
            this.charter = charter;
            return this;
        }
        public Builder schoolCounty(String schoolName){
            this.schoolCounty = schoolName;
            return this;
        }
        public Builder countyId(int countyId){
            this.countyId = countyId;
            return this;
        }
        public Builder gradeSpan(String gradeSpan){
            this.gradeSpan = gradeSpan;
            return this;
        }
        public Builder totalStudents(int totalStudents){
            this.totalStudents = totalStudents;
            return this;
        }
        public Builder classroomTeachers(int classroomTeachers){
            this.classroomTeachers = classroomTeachers;
            return this;
        }
        public Builder studentsPerTeacher(double studentsPerTeacher){
            this.studentsPerTeacher = studentsPerTeacher;
            return this;
        }
        public Builder title1School(String title1School){
            this.title1School = title1School;
            return this;
        }
        public Builder title1SchoolWideProgram(String title1SchoolWideProgram){
            this.title1SchoolWideProgram = title1SchoolWideProgram;
            return this;
        }
        public Builder magnet(String magnet){
            this.magnet = magnet;
            return this;
        }
        public Builder locale(String locals){
            this.locale = locals;
            return this;
        }
        public Builder enrollmentByGrade(String enrollmentByGrade){
            this.enrollmentByGrade = enrollmentByGrade;
            return this;
        }
        public Builder enrollmentByRace(String enrollmentByRace){
            this.enrollmentByRace = enrollmentByRace;
            return this;
        }
        public Builder enrollmentByGender(String enrollmentByGender){
            this.enrollmentByGender = enrollmentByGender;
            return this;
        }
        public Builder freeLunchEligible(boolean isFreeLunchEligible){
            this.freeLunchEligible = isFreeLunchEligible;
            return this;
        }
        public Builder reducedPriceLunchEligible(boolean reducedPriceLunchEligible){
            this.reducedPriceLunchEligible = reducedPriceLunchEligible;
            return this;
        }
        public Builder greatschoolRating(boolean greatschoolRating){
            this.greatschoolRating = greatschoolRating;
            return this;
        }
        public Builder schoolLat(double schoolLat){
            this.schoolLat = schoolLat;
            return this;
        }
        public Builder schoolLon(double schoolLon){
            this.schoolLon = schoolLon;
            return this;
        }
        public Builder geoJson(String geoJson){
            this.geoJson = geoJson;
            return this;
        }
        public Builder geoSource(String geoSource){
            this.geoSource = geoSource;
            return this;
        }
        public Builder riskRank(double riskRank){
            this.riskRank = riskRank;
            return this;
        }
        public Builder schoolZipcode(String schoolZipcode){
            this.schoolZipcode = schoolZipcode;
            return this;
        }
        public Builder zipId(int zipId){
            this.zipId = zipId;
            return this;
        }
        public Builder isPrivateSchool(boolean isPrivateSchool){
            this.isPrivateSchool = isPrivateSchool;
            return this;
        }
        public Builder comments(String comments){
            this.comments = comments;
            return this;
        }
        public Builder createdDate(Date createdDate){
            this.createdDate = createdDate;
            return this;
        }
        public Builder createdBy(String createdBy){
            this.createdBy = createdBy;
            return this;
        }
        public Builder modifiedDate(Date modifiedDate){
            this.modifiedDate = modifiedDate;
            return this;
        }
        public Builder modifiedBy(String modifiedBy){
            this.modifiedBy = modifiedBy;
            return this;
        }
        public Builder active(boolean active){
            this.active = active;
            return this;
        }
        public Builder districtId(int districtId){
            this.districtId = districtId;
            return this;
        }
    }
}
