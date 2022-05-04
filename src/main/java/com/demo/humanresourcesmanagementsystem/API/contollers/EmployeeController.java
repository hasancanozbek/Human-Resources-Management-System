package com.demo.humanresourcesmanagementsystem.API.contollers;

import com.demo.humanresourcesmanagementsystem.Business.abstracts.EmployeeService;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.DataResult;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.ErrorDataResult;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.Result;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.Employee;
import com.demo.humanresourcesmanagementsystem.Entities.dtos.JobPostingDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/addEmployee")//Test edildi
    public Result addEmployee(@Valid @RequestBody Employee employee) throws Exception {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/getAllEmployees")//Test edildi
    public DataResult<List<Employee>> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/findByActiveJobPostings")//Test edildi
    public DataResult<List<JobPostingDto>> findByActiveJobPostings() {
        return employeeService.findByActiveJobPostings();
    }

    @GetMapping("/findByJobPostingsWithSorting")//Test edildi
    public DataResult<List<JobPostingDto>> findByJobPostingsWithSorting() {
        return employeeService.findByJobPostingsWithSorting();
    }

    @GetMapping("/findByCompanyJobPostings")//Test edildi
    public DataResult<List<JobPostingDto>> findByCompanyJobPostings(@RequestParam String companyName) {
        return employeeService.findByCompanyJobPostings(companyName);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDataResult<Object> handleValidationExceptions(
            MethodArgumentNotValidException exception) {
        Map<String, String> errors = new HashMap<>();
        for (FieldError fieldError : exception.getBindingResult().getFieldErrors()) {
            errors.put(fieldError.getField(), fieldError.getDefaultMessage());
        }
        ErrorDataResult<Object> validationErrors = new ErrorDataResult<Object>("Validation errors", errors);
        return validationErrors;
    }
}
