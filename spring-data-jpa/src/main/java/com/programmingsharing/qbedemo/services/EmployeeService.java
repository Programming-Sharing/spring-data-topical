package com.programmingsharing.qbedemo.services;

import com.programmingsharing.qbedemo.domain.EmployeeSearchDto;
import com.programmingsharing.qbedemo.entities.Employees;

import java.util.List;

public interface EmployeeService {
    List<Employees> getEmployeesByExample(EmployeeSearchDto employeeSearchDto);
}
