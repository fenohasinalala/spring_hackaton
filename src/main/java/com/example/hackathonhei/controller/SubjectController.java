package com.example.hackathonhei.controller;

import com.example.hackathonhei.model.Subject;
import com.example.hackathonhei.service.SubjectService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class SubjectController {

    private SubjectService subjectService;

    @CrossOrigin
    @GetMapping("/subject")
    public List<Subject> getAllSubject(){
        return subjectService.getAllSubject();
    }

    @CrossOrigin
    @GetMapping("/subject/search")
    public Optional<Subject> getSubjectBySubjectName(
            @RequestParam(name = "id")Long id
    ){
        return subjectService.getSubjectById(id);
    }

    @CrossOrigin
    @PostMapping("/subject")
    public String insertSubject(@RequestBody Subject subject){
        return subjectService.insertSubject(subject);
    }

    @CrossOrigin
    @DeleteMapping("/subject/{id}")
    public String deleteSubject (@PathVariable Long id){
        return subjectService.deleteById(id);
    }
}
