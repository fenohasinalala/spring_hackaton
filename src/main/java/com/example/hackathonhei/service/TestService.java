package com.example.hackathonhei.service;

import com.example.hackathonhei.model.Test;
import com.example.hackathonhei.repository.TestRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TestService {

    private TestRepository repository;

    public List<Test> getAllTest(){
        return repository.findAll();
    }
    public Optional<Test> getTestById(Long id){
        return repository.findByIdTest(id);
    }

}
