package com.example.hackathonhei.controller;

import com.example.hackathonhei.model.CandidateGrade;
import com.example.hackathonhei.service.CandidateGradeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CandidateGradeController {
    private CandidateGradeService candidateGradeService;

    @GetMapping("/candidateGrade")
    public List<CandidateGrade> getAllCandidateGrade(){
        return candidateGradeService.getAllCandidateGrade();
    };

    @PostMapping("/candidateGrade")
    public String insertCandidateGrade(@RequestBody CandidateGrade candidateGrade){
        return candidateGradeService.insertCandidateGrade(candidateGrade);
    }

    @PatchMapping("/candidateGrade")
    public String updateCandidateGrade(
            @RequestParam(name = "id") Long id,
            @RequestParam(name = "newGrade") Float newGrade
    ){
        return candidateGradeService.updateCandidateGrade(id, newGrade);
    }

    @DeleteMapping("/candidateGrade/{id}")
    public void deleteCandidateGrade(@PathVariable Long id){
        candidateGradeService.deleteById(id);
    }
}
