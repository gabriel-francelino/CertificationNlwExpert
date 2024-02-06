package com.rocketseat.certification_nwl.modules.students.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CertificationStudentEntity {
    private UUID id;
    private UUID studentId;
    private String technology;
    private int grade;
    List<AnswersCertificationsEntity> answersCertificationsEntities;
}
