package com.example.hackathonhei.service;

import com.example.hackathonhei.model.Subject;
import com.example.hackathonhei.repository.SubjectRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SubjectService {

    private SubjectRepository repository;

    public Optional<Subject> getSubjectById(Long id){
        return repository.findByIdSubject(id);
    }

    public String insertSubject(Subject Subject){
        repository.save(Subject);
        return "Subject add successfully";
    }

    public List<Subject> getAllSubject(){
        return repository.findAll();
    }

    public String deleteById (Long id){
        repository.deleteById(id);
        return "Subject deleted successfully";
    }
}
