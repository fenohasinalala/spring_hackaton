package com.example.hackathonhei.service;

import com.example.hackathonhei.model.Candidate;
import com.example.hackathonhei.model.CandidateGrade;
import com.example.hackathonhei.repository.CandidateGradeRepository;
import com.example.hackathonhei.repository.CandidateRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CandidateGradeService {
    private CandidateGradeRepository repository;

    public String insertCandidateGrade(CandidateGrade candidateGrade){
        repository.save(candidateGrade);
        return "OK";
    }
    public List<CandidateGrade> getAllCandidateGrade(){
        return repository.findAll();
    }

    public String deleteById (Long id){
        repository.deleteById(id);
        return "CandidateGrade deleted successfully";
    }
    public String updateCandidateGrade(Long id, Float newCandidateGrade){
        Optional<CandidateGrade> optionalCandidateGrade = repository.findByIdCandidateGrade(id);

        if(optionalCandidateGrade.isPresent()){
            CandidateGrade candidateGrade = optionalCandidateGrade.get();
            candidateGrade.setGrade(newCandidateGrade);
            repository.save(candidateGrade);
            return "Candidate updated successfully";
        }else{
            throw new NullPointerException("User has not been found");
        }
    }

}
