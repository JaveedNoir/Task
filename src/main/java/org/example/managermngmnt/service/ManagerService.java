package org.example.managermngmnt.service;

import org.example.managermngmnt.model.Manager;

import java.util.List;

public interface ManagerService {
    public List<Manager> findAll();
    public Manager findById(Long id);
    public Manager addManager(Manager manager);
    public void updateManager(Long id,Manager manager);
    public void deleteManager(Long id);
}

