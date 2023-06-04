package com.decabank.bank.services.Implementation;

import com.decabank.bank.model.Manager;
import com.decabank.bank.services.ManagerService;

public class ManagerServiceImp implements ManagerService {
    public String hireStaff(Manager manager) {
        if (manager.isVacancy()) {
            return ("No vacancy");
        }
        return  ("Manager can hire a new staff");
    }

}
