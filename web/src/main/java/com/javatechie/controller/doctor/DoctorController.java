package com.javatechie.controller.doctor;

import com.javatechie.model.doctor.Doctor;
import com.javatechie.service.doctor.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/getAllDoctors")
    public List<Doctor> getDoctors() {
        return doctorService.getDoctors();
    }
}
