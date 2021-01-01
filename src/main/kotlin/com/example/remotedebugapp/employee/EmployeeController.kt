package com.example.remotedebugapp.employee

import org.springframework.web.bind.annotation.*

@RestController
class EmployeeController(val employeeService: EmployeeService) {

    @GetMapping("/employeeDetails")
    fun getEmployeeDetails(): List<Employee> {
        return employeeService.getEmployeeDetails()
    }

    @PostMapping("/addEmployee")
    fun addEmployee(@RequestBody employee: Employee): List<Employee> {
        return employeeService.setEmployee(employee)
    }

}