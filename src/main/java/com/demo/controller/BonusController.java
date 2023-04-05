package com.demo.controller;

import com.demo.payload.BonusDto;
import com.demo.repository.BonusRepository;
import com.demo.repository.EmployeeRepository;
import com.demo.service.BonusService;
import com.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Employees")
public class BonusController {
    @Autowired
private BonusService bonusService;


    //http://localhost:8080/api/Employees/1/bonuses
    @PostMapping("{empId}/bonuses")
    public ResponseEntity<BonusDto> saveBonus(@PathVariable Long empId, @RequestBody BonusDto bonusDto){
        BonusDto dto = bonusService.saveBonus(empId, bonusDto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }


}
