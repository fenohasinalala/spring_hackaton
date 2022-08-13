package com.example.hackathonhei.service;

import com.example.hackathonhei.model.BacGrade;
import com.example.hackathonhei.repository.BacGradeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BacGradeService {
    private BacGradeRepository repository;

    public Optional<BacGrade> getBacGradeById(Long id){
        return repository.findByIdBacGrade(id);
    }

    public String insertBacGrade(BacGrade grade){
        repository.save(grade);
        return "add successfully";
    }

    public List<BacGrade> getAllBacGrade(){
        return repository.findAll();
    }

    public String deleteById(Long id){
        repository.deleteById(id);
        return "deleted";
    }
}
