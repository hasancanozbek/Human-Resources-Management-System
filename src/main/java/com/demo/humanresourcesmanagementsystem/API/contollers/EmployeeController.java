package com.demo.humanresourcesmanagementsystem.API.contollers;

import com.demo.humanresourcesmanagementsystem.Business.abstracts.EmployeeService;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.DataResult;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.Result;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.Employee;
import com.demo.humanresourcesmanagementsystem.Entities.dtos.JobPostingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/addEmployee")
    public Result addEmployee(@RequestBody Employee employee) throws Exception {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/getAllEmployees")
    public DataResult<List<Employee>> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/findByActiveJobPostings")
    public DataResult<List<JobPostingDto>> findByActiveJobPostings() {
        return employeeService.findByActiveJobPostings();
    }

    @GetMapping("/findByJobPostingsWithSorting")
    public DataResult<List<JobPostingDto>> findByJobPostingsWithSorting() {
        return employeeService.findByJobPostingsWithSorting();
    }

    public DataResult<List<JobPostingDto>> findByCompanyJobPostings(@RequestParam String companyName) {
        return employeeService.findByCompanyJobPostings(companyName);
    }
}
