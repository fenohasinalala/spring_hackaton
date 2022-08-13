package com.example.hackathonhei.repository;

import com.example.hackathonhei.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {
    Optional <Test> findByIdTest(Long Id);
    @Query("SELECT t FROM Test t")
    List<Test> test();
}
