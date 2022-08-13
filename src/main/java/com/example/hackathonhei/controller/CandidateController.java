package com.example.hackathonhei.controller;

import com.example.hackathonhei.model.Candidate;
import com.example.hackathonhei.service.CandidateService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CandidateController {
    private CandidateService candidateService;

    @GetMapping("/")
    public String hello(){
        return "Hello world";
    }

    @GetMapping("/candidates")
    public List<Candidate> getAllCandidates(){
        return candidateService.getAllCandidates();
    }

    @GetMapping("/candidates/search")
    public List<Candidate> findCandidateByFullName(
            @RequestParam(name = "firstName") String firstName,
            @RequestParam(name = "lastName") String lastName)
    {
        return candidateService.searchCandidateByFullName(firstName,lastName);
    }

    @PostMapping("/candidates")
    public String insertStudent(@RequestBody Candidate candidate){
        return candidateService.insertCandidate(candidate);
    }

    @PatchMapping("/candidates")
    public String updateCandidate(
            @RequestParam(name = "id") Long id,
            @RequestParam(name = "newFirstName") String newFirstName)
    {
        return candidateService.updateFirstName(id,newFirstName);
    }

    @DeleteMapping("/candidates/{id}")
    public void delete(@PathVariable Long id){
        candidateService.deleteById(id);
    }
}
