package com.example.hackathonhei.repository;

import com.example.hackathonhei.model.Candidate;
import com.example.hackathonhei.model.CandidateGrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CandidateGradeRepository extends JpaRepository<CandidateGrade, Long> {
    Optional<CandidateGrade> findByIdCandidateGrade(Long id);
    @Query(value = "SELECT c FROM CandidateGrade c")
    List<CandidateGrade> test();


}
