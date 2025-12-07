package org.example.managermngmnt.repository;

import org.example.managermngmnt.model.Manager;

import java.util.List;

public interface ManagerRepository {
    public List<Manager> findAll();
    public Manager findById(Long id);
    public void addManager(Manager manager);
    public void updateManager(Long id,Manager manager);
    public void deleteManager(Long id);
}
