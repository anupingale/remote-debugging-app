package com.example.remotedebugapp.employee

import org.springframework.stereotype.Service

@Service
class EmployeeService {
    private val employees: MutableList<Employee> = mutableListOf()

    fun getEmployeeDetails(): List<Employee> {
        return employees.toList()
    }

    fun setEmployee(employee: Employee): List<Employee> {
        employees.add(employee)
        return employees.toList()
    }

}
