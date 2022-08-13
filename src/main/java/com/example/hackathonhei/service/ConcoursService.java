package com.example.hackathonhei.service;

import com.example.hackathonhei.model.Concours;
import com.example.hackathonhei.repository.ConcoursRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ConcoursService {

    private ConcoursRepository repository;

    public String insertConcours(Concours concours){
        repository.save(concours);
        return "OK";
    }

    public List<Concours> getAllConcours(){
        return repository.findAll();
    }

    public String deleteById (Long id){
        repository.deleteById(id);
        return "delete concours successfully";
    }

    public String updateConcours(Long id, String newSession){
        Optional<Concours> optionalConcours = repository.findById(id);

        if(optionalConcours.isPresent()){
            Concours concours = optionalConcours.get();
            concours.setSession(newSession);
            repository.save(concours);
            return "Concours add successfully";
        }else{
            throw new NullPointerException("Concours has not been found");
        }
    }
}
