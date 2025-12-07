package org.example.managermngmnt.controller;

import org.example.managermngmnt.model.Manager;
import org.example.managermngmnt.service.ManagerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manager")
public class ManagerController {
    private final ManagerService managerService;

    public ManagerController(ManagerService managerService) {
        this.managerService = managerService;
    }

    @GetMapping
    public ResponseEntity<List<Manager>> getAllManagers() {
        List<Manager> mngr = managerService.findAll();
        if (mngr.isEmpty()) {
            throw new NullPointerException("Managers not found");
        } else {
            return ResponseEntity.ok(mngr);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Manager> getManagerById(@PathVariable Long id) {
       Manager manager= managerService.findById(id);
       return ResponseEntity.ok(manager);
    }

    @PostMapping
    public ResponseEntity<Manager> addManager(@RequestBody Manager manager) {
        Manager manager1= managerService.addManager(manager);
        return ResponseEntity.ok(manager1);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Manager> updateManager(@PathVariable Long id,@RequestBody Manager manager) {
        managerService.updateManager(id,manager);
        return ResponseEntity.ok(manager);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Manager> deleteManager(@PathVariable Long id) {
        managerService.deleteManager(id);
        return ResponseEntity.ok().build();
    }

}
