package org.example.managermngmnt.service;

import org.example.managermngmnt.model.Manager;
import org.example.managermngmnt.repository.ManagerRepository;
import org.example.managermngmnt.validator.Validator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerServ implements ManagerService {

    private final ManagerRepository managerRepository;
    private final Validator validator;

    public ManagerServ(ManagerRepository managerRepository, Validator validator) {
        this.managerRepository = managerRepository;
        this.validator = validator;
    }

    @Override
    public List<Manager> findAll() {
        return managerRepository.findAll();
    }

    @Override
    public Manager findById(Long id) {
        return managerRepository.findById(id);
    }

    @Override
    public Manager addManager(Manager manager) {
        if (validator.ageValidate(manager) && validator.mailValidate(manager)) {
            managerRepository.addManager(manager);
        }
        return manager;
    }

    @Override
    public void updateManager(Long id, Manager manager) {
        if (validator.ageValidate(manager) && validator.mailValidate(manager)) {
            managerRepository.updateManager(id, manager);
        }
    }

    @Override
    public void deleteManager(Long id) {
        managerRepository.deleteManager(id);
    }





}
