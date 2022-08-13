package com.example.hackathonhei.repository;

import com.example.hackathonhei.model.BacGrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BacGradeRepository extends JpaRepository<BacGrade, Long> {
    Optional<BacGrade> findByIdBacGrade(Long id);

    @Query("SELECT b FROM BacGrade b")
    List<BacGrade> test();
}
