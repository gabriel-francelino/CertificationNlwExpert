package com.rocketseat.certification_nwl.modules.students.controllers;

import com.rocketseat.certification_nwl.modules.students.dto.VerifyHasCertificationDTO;
import com.rocketseat.certification_nwl.modules.students.useCases.VerifyIfHasCertificationUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;

    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO) {
        var result = this.verifyIfHasCertificationUseCase.execute(verifyHasCertificationDTO);

        return result ? "Usuário já fez a prova" : "Usuário pode fazer a prova";
    }
}
