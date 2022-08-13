package com.example.hackathonhei.repository;

import com.example.hackathonhei.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

    Optional<Subject> findByIdSubject(Long id);
    @Query("SELECT m FROM Subject m")
    List<Subject> test();
}
