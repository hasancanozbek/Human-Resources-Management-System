package com.demo.humanresourcesmanagementsystem.API.contollers;

import com.demo.humanresourcesmanagementsystem.Business.abstracts.CvService;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.DataResult;
import com.demo.humanresourcesmanagementsystem.Core.Utilities.Results.Result;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.*;
import com.demo.humanresourcesmanagementsystem.Entities.dtos.EducationDto;
import com.demo.humanresourcesmanagementsystem.Entities.dtos.WorkDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cv")
public class CvController {

    private final CvService cvService;

    @Autowired
    public CvController(CvService cvService) {
        this.cvService = cvService;
    }

    @PostMapping("/addCV")
    public Result addCV(@RequestBody CV cv) {
        return cvService.addCV(cv);
    }

    @PostMapping("/addEducationInfo")
    public Result addEducationInfo(@RequestBody Education education) {
        return cvService.addEducationInfo(education);
    }

    @PostMapping("/addWorkInfo")
    public Result addWorkInfo(@RequestBody Work work) {
        return cvService.addWorkInfo(work);
    }

    @PostMapping("/addLanguegeInfo")
    public Result addLanguegeInfo(@RequestBody Languege languege) {
        return cvService.addLanguegeInfo(languege);
    }

    @PostMapping("/addTechnologyInfo")
    public Result addTechnologyInfo(@RequestBody Technology technology) {
        return cvService.addTechnologyInfo(technology);
    }

    @GetMapping("/findAllByOrderByGraduationDateDesc")
    public DataResult<List<Education>> findAllByOrderByGraduationDateDesc() {
        return cvService.findAllByOrderByGraduationDateDesc();
    }

    @GetMapping("/findByEducationId")
    public DataResult<Education> findById(@RequestParam int id) {
        return cvService.findByEducationId(id);
    }

    @GetMapping("/findAllByEducationId")
    public DataResult<List<EducationDto>> findAllByEducationId(@RequestParam int id) {
        return cvService.findAllByEducationId(id);
    }

    @GetMapping("/findAllByOrderByEndDateDesc")
    public DataResult<List<Work>> findAllByOrderByEndDateDesc() {
        return cvService.findAllByOrderByEndDateDesc();
    }

    @GetMapping("/findByWorkId")
    public DataResult<Work> findByWorkId(@RequestParam int id) {
        return cvService.findByWorkId(id);
    }

    @GetMapping("/findAllByWorkId")
    public DataResult<List<WorkDto>> findAllByWorkId(@RequestParam int id) {
        return cvService.findAllByWorkId(id);
    }

    //ToDo : Hatalar giderilecek
    @PostMapping("/uploadPhoto")
    public ResponseEntity<?> uploadPhoto(@RequestParam(name = "id") int id,
                                         @RequestParam String file) {
        return ResponseEntity.ok(this.cvService.uploadPhoto(id, file));
    }

    @GetMapping("/findByEmployeeId")
    public DataResult<CV> findByEmployeeId(@RequestParam int employeeId) {
        return cvService.findByEmployeeId(employeeId);
    }
}
