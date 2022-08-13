package com.example.hackathonhei.controller;

import com.example.hackathonhei.model.BacGrade;
import com.example.hackathonhei.service.BacGradeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class BacGradeController {
    private BacGradeService bacGradeService;

    @GetMapping("/bac_grade")
    public List<BacGrade>  getAllBacGrade(){
        return bacGradeService.getAllBacGrade();
    }

    @GetMapping("/bac_grade/search")
    public Optional<BacGrade> getBacGradeById(
            @RequestParam(name = "id")Long id
    ){
        return bacGradeService.getBacGradeById(id);
    }

    @PostMapping("/bac_grade")
    public String insertBacGrade(@RequestBody BacGrade bacGrade){
        return bacGradeService.insertBacGrade(bacGrade);
    }

    @DeleteMapping("/bac_grade/{id}")
    public String deleteBacGrade(@PathVariable Long id){
        return bacGradeService.deleteById(id);
    }
}
