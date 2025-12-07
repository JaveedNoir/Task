package org.example.managermngmnt.repository;

import org.example.managermngmnt.model.Manager;
import org.example.managermngmnt.validator.Validator;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ManagerRepo implements ManagerRepository {
    private List<Manager> managers = new ArrayList<Manager>();
    private static Long id = 1L;


    @Override
    public List<Manager> findAll() {
        return managers;
    }

    @Override
    public Manager findById(Long id) {
        return managers.stream()
                .filter(m -> m.getId().equals(id))
                .findFirst().orElse(null);

    }

    @Override
    public void addManager(Manager manager) {
        if (manager != null) {
            managers.add(manager);
            manager.setId(this.id++);
        } else {
            throw new IllegalArgumentException("Manager is null");
        }
    }

    @Override
    public void updateManager(Long id, Manager manager) {
        if (manager == null) {
            throw new IllegalArgumentException("Manager is null");
        }
        Manager man = managers.stream()
                .filter(m -> m.getId().equals(id))
                .findFirst().orElse(null);
        if (man == null) {
            throw new IllegalArgumentException("Manager is null");
        }
        man.setFirstName(manager.getFirstName());
        man.setLastName(manager.getLastName());
        man.setAge(manager.getAge());
        man.setEmail(manager.getEmail());
        man.setDepartment(manager.getDepartment());
        man.setLevel(manager.getLevel());

    }


    @Override
    public void deleteManager(Long id) {
        managers.remove(findById(id));
    }
}