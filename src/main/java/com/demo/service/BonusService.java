package com.demo.service;

import com.demo.entity.Bonus;
import com.demo.entity.Employee;
import com.demo.payload.BonusDto;
import com.demo.repository.BonusRepository;
import com.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BonusService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private BonusRepository bonusRepository;

    public BonusDto saveBonus(Long empId, BonusDto bonusDto) {
        Employee employee = employeeRepository.findById(empId).get();

        Bonus bonus = new Bonus();
        bonus.setAmount(bonusDto.getAmount());
        bonus.setEmployee(employee);
        Bonus newBonus = bonusRepository.save(bonus);
//http://localhost:8080/api/Employees/1/bonuses
        BonusDto bonusDto1 = new BonusDto();
        bonusDto1.setBonusId(newBonus.getBonusId());
        bonusDto1.setAmount(newBonus.getAmount());
        return bonusDto1;

    }
}
