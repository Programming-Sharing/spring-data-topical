package com.programmingsharing.qbedemo.controller;

import com.programmingsharing.qbedemo.domain.EmployeeSearchDto;
import com.programmingsharing.qbedemo.entities.Employees;
import com.programmingsharing.qbedemo.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "employee")
public class QBEDemoController {

    private final EmployeeService employeeService;

    public QBEDemoController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/search")
    @ResponseBody
    public Iterable<Employees> search(@RequestBody EmployeeSearchDto employeeSearchDto){
        return employeeService.getEmployeesByExample(employeeSearchDto);
    }
}
