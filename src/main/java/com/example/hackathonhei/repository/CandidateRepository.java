package com.example.hackathonhei.repository;

import com.example.hackathonhei.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
    Optional<Candidate> findByIdCandidate(Long id);

    // JPQL = langage de requete sur les objets Java : au cas ou les requetes JPA ne vous permettent pas de faire la requete que vous voulez
    @Query(value = "SELECT c FROM Candidate c")
    List<Candidate> test();
    List<Candidate> findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase(String firstName, String lastName);
}
