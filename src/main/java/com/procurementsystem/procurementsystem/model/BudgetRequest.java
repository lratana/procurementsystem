package com.procurementsystem.procurementsystem.model;

import com.procurementsystem.procurementsystem.enumeration.BudgetApproveStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
@Table(name = "tbl_BudgetRequest")
public class BudgetRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long budgetRequestId;
    private Double requestAmount;
    private Date requestDate;
    private Double approvalBudget;
    private Date approvalBudgetDate;
    private BudgetApproveStatus budgetApproveStatus;
    private String approvalBy;
    private String remarks;
    private Long projectId;
}
