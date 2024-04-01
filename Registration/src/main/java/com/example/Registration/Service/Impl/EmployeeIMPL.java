package com.example.Registration.Service.Impl;

import com.example.Registation.Dto.EmployeeDTO;
import com.example.Registation.Entity.Employee;
import com.example.Registation.Repo.EmployeeRepo;
import com.example.Registation.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeIMPL implements EmployeeService
{
    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public String addEmployee(EmployeeDTO employeeDTO)
    {

        Employee employee = new Employee(
                employeeDTO.getEmployeeid(),
                employeeDTO.getEmployeename(),
                employeeDTO.getAddress(),
                employeeDTO.getMobile()
        );
        employeeRepo.save(employee);
        return employee.getEmployeename();
    }
}
