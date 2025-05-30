package com.procurementsystem.procurementsystem.model;

import com.procurementsystem.procurementsystem.enumeration.EvaluationMethod;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "tbl_evaluation")
public class Evaluation extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long evaluation_id;
    private double technical_score;
    private double financial_score;
    private double total_score;
    private EvaluationMethod evaluationMethod;
    private Date evaluation_date;
    private String remarkEvaluation;
    private Long bidId;
}
