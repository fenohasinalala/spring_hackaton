package com.example.hackathonhei.controller;

import com.example.hackathonhei.model.Concours;
import com.example.hackathonhei.service.ConcoursService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ConcoursController {

    private ConcoursService concoursService;

    @CrossOrigin
    @GetMapping("/concours")
    public List<Concours> getAllConcours(){
        return concoursService.getAllConcours();
    };

    @CrossOrigin
    @PostMapping("/concours")
    public String insertConcours(@RequestBody Concours concours){
        return concoursService.insertConcours(concours);
    }

    @CrossOrigin
    @PatchMapping("/concours")
    public String updateConcours(
            @RequestParam(name = "id") Long id,
            @RequestParam(name = "newSession") String newSession
    ){
        return concoursService.updateConcours(id, newSession);
    }

    @CrossOrigin
    @DeleteMapping("/concours/{id}")
    public void deleteConcours(@PathVariable Long id){
        concoursService.deleteById(id);
    }
}
