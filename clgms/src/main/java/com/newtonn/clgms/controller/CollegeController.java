package com.newtonn.clgms.controller;

import com.newtonn.clgms.dto.CollegeDto;
import com.newtonn.clgms.service.CollegeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/college")
@AllArgsConstructor
public class CollegeController {

    private CollegeService collegeService;

    @GetMapping("/")
    public String hellowWorld(){

        return "Hellow World";
    }

    @PostMapping("/save")
    public ResponseEntity<CollegeDto> saveCollege(@RequestBody CollegeDto collegeDto){
        CollegeDto savedCollege = collegeService.saveCollege(collegeDto);
        return new ResponseEntity<>(savedCollege, HttpStatus.CREATED);
    }
}
