package com.example.hackathonhei.service;

import com.example.hackathonhei.model.Candidate;
import com.example.hackathonhei.repository.CandidateRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CandidateService {
    private CandidateRepository repository;

    public String insertCandidate(Candidate candidate){
        repository.save(candidate);
        return "OK";
    }

    public List<Candidate> getAllCandidates(){
        return repository.findAll();
    }

    public List<Candidate> searchCandidateByFullName(String firstName, String lastName){
        return repository.findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase(firstName,lastName);
    }

    public String deleteById(Long id){
        repository.deleteById(id);
        return "Resource deleted succesfully";
    }

    public String updateFirstName(Long id, String newFirstName){
        Optional<Candidate> optionalCandidate = repository.findByIdCandidate(id);

        if(optionalCandidate.isPresent()){
            Candidate candidate = optionalCandidate.get();
            candidate.setFirstName(newFirstName);
            repository.save(candidate);
            return "Candidate updated successfully";
        }else{
            throw new NullPointerException("User has not been found");
        }
    }
}
