package com.programmingsharing.qbedemo.services;

import com.programmingsharing.qbedemo.domain.EmployeeSearchDto;
import com.programmingsharing.qbedemo.entities.Employees;

public interface EmployeeService {
    Iterable<Employees> getEmployeesByExample(EmployeeSearchDto employeeSearchDto);
}
