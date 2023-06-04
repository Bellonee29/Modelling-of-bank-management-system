package com.decabank.bank.model;

import java.util.ArrayList;
import java.util.List;

public class Manager extends BaseClass{
    private Boolean vacancy;
    private List<Applicants> applicants = new ArrayList<>();
    public Manager(String name, String address, Integer age,Boolean vacancy) {
        super(name, address, age);
        this.vacancy = vacancy;

    }

    public List<Applicants> getApplicants() {
        return applicants;
    }

    public void setApplicants(List<Applicants> applicants) {
        this.applicants = applicants;
    }

    public boolean isVacancy() {
        return vacancy;
    }

    public void setVacancy(boolean vacancy) {
        this.vacancy = vacancy;
    }

}
