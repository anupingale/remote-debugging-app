package com.example.remotedebugapp.employee

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/employeeDetails")
class EmployeeController(val employeeService: EmployeeService) {

    @GetMapping
    fun getEmployeeDetails(): List<Employee> {
        return employeeService.getEmployeeDetails()
    }

    @PostMapping
    fun addEmployee(@RequestBody employee: Employee): List<Employee> {
        return employeeService.setEmployee(employee)
    }

}