package com.learning.crud;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {

    private final SoftwareEngineerRepository repository;

    public SoftwareEngineerService(SoftwareEngineerRepository repository) {
        this.repository = repository;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return repository.findAll();
    }

    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        repository.save(softwareEngineer);
    }


    public SoftwareEngineer getSoftwareEngineerById(Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalStateException(id + " Not Found"));
    }
}
