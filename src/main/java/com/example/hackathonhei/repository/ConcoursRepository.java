package com.example.hackathonhei.repository;

import com.example.hackathonhei.model.Concours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ConcoursRepository extends JpaRepository<Concours, Long> {

    Optional<Concours> findById(Long id);

    @Query(value = "SELECT x FROM Concours x")
    List<Concours> test();
}
