package com.demo.humanresourcesmanagementsystem.API.contollers;

import com.demo.humanresourcesmanagementsystem.Business.abstracts.CvService;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.DataResult;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.Result;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.CV;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.Education;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.Work;
import com.demo.humanresourcesmanagementsystem.Entities.dtos.EducationDto;
import com.demo.humanresourcesmanagementsystem.Entities.dtos.WorkDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import java.time.LocalDate;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/cv")
public class CvController {

    private final CvService cvService;

    @Autowired
    public CvController(CvService cvService) {
        this.cvService = cvService;
    }


    @PostMapping("/addCV")
    public Result addCV(@RequestParam String github, @RequestParam String linkedin, @RequestParam String coverLetter, @RequestParam String photo, @RequestParam int employeeId) {
        return cvService.addCV(github, linkedin, coverLetter, photo, employeeId);
    }


    @PostMapping("/addEducationInfo")
    public Result addEducationInfo(@RequestParam String schoolName, @RequestParam String department, @RequestParam LocalDate startingDate, @RequestParam LocalDate graduationDate, @RequestParam int cvId) {
        return cvService.addEducationInfo(schoolName, department, startingDate, graduationDate, cvId);
    }


    @PostMapping("/addWorkInfo")
    public Result addWorkInfo(@RequestParam String workplace, @RequestParam int jobId, @RequestParam LocalDate startingDate, @RequestParam LocalDate endDate, @RequestParam int cvId) {
        return cvService.addWorkInfo(workplace, jobId, startingDate, endDate, cvId);
    }


    @PostMapping("/addLanguegeInfo")
    Result addLanguegeInfo(@RequestParam int cvId, @RequestParam String languege, @DecimalMin("1") @DecimalMax("5") @RequestParam int level) {
        return cvService.addLanguegeInfo(cvId, languege, level);
    }


    @PostMapping("/addTechnologyInfo")
    public Result addTechnologyInfo(@RequestParam String technology, @RequestParam int cvId) {
        return cvService.addTechnologyInfo(technology, cvId);
    }


    @GetMapping("/findAllByOrderByGraduationDateDesc")//Test edildi
    public DataResult<List<Education>> findAllByOrderByGraduationDateDesc() {
        return cvService.findAllByOrderByGraduationDateDesc();
    }


    @GetMapping("/findByEducationId")//Test edildi
    public DataResult<Education> findById(@RequestParam int id) {
        return cvService.findByEducationId(id);
    }


    @GetMapping("/findAllByEducationId")//Test edildi
    public DataResult<List<EducationDto>> findAllByEducationId(@RequestParam int id) {
        return cvService.findAllByEducationId(id);
    }


    @GetMapping("/findAllByOrderByEndDateDesc")//Test edildi
    public DataResult<List<Work>> findAllByOrderByEndDateDesc() {
        return cvService.findAllByOrderByEndDateDesc();
    }


    @GetMapping("/findByWorkId")//Test edildi
    public DataResult<Work> findByWorkId(@RequestParam int id) {
        return cvService.findByWorkId(id);
    }


    @GetMapping("/findAllByWorkId")//Test edildi
    public DataResult<List<WorkDto>> findAllByWorkId(@RequestParam int id) {
        return cvService.findAllByWorkId(id);
    }


    @GetMapping("/findCVByEmployeeId")//Test edildi.
    public DataResult<List<CV>> findCVByEmployeeId(@RequestParam int employeeId) {
        return cvService.findCVByEmployeeId(employeeId);
    }


}
