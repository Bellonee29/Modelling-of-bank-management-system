package com.decabank.bank.model;

public class Applicants {
    private String name;
    private String Phone;
    private String address;
    private String qualification;
    private Integer interviewRating;
    private Integer yearOfExperience;

    public Applicants(String name, String phone, String address, String qualification, Integer interviewRating, Integer yearOfExperience) {
        this.name = name;
        Phone = phone;
        this.address = address;
        this.qualification = qualification;
        this.interviewRating = interviewRating;
        this.yearOfExperience = yearOfExperience;
    }

    public Integer getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(Integer yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Integer getInterviewRating() {
        return interviewRating;
    }

    public void setInterviewRating(Integer interviewRating) {
        this.interviewRating = interviewRating;
    }

    @Override
    public String toString() {
        return "Applicants{" +
                "name='" + name + '\'' +
                ", Phone='" + Phone + '\'' +
                ", address='" + address + '\'' +
                ", qualification='" + qualification + '\'' +
                ", interviewRating=" + interviewRating +
                ", interviewRating=" + yearOfExperience +
                '}';
    }
}
