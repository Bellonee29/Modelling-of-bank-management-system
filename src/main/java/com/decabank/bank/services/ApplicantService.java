package com.decabank.bank.services;

import com.decabank.bank.model.Applicants;
import com.decabank.bank.model.Manager;

public interface ApplicantService {
    String hireApplicants(Applicants applicants, Manager manager);
    String addApplicants(Applicants applicants, Manager manager);
}
