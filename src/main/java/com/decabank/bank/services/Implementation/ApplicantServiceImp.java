package com.decabank.bank.services.Implementation;

import com.decabank.bank.model.Applicants;
import com.decabank.bank.model.Manager;
import com.decabank.bank.services.ApplicantService;

public class ApplicantServiceImp implements ApplicantService {

    @Override
    public String hireApplicants(Applicants applicants, Manager manager) {
        if (applicants.getInterviewRating() >= 10 && applicants.getYearOfExperience() >=2){
            return ("Manager has hired " + applicants.getName() + " With " +
                    applicants.getYearOfExperience() + " years of experience and "
                    + applicants.getQualification());


        }
        return "Applicant not qualify for this position";
    }

    @Override
    public String addApplicants(Applicants applicants, Manager manager) {
        manager.getApplicants().add(applicants);
        return null;
    }

}
