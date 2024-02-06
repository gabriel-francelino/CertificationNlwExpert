package com.rocketseat.certification_nwl.modules.students.useCases;

import com.rocketseat.certification_nwl.modules.students.dto.VerifyHasCertificationDTO;
import org.springframework.stereotype.Service;

@Service
public class VerifyIfHasCertificationUseCase {
    public boolean execute(VerifyHasCertificationDTO dto) {
        return dto.getEmail().equals("gabriel@gmail.com") && dto.getTechnology().equals("JAVA");
    }
}
