package com.procurementsystem.procurementsystem.model;

import com.procurementsystem.procurementsystem.enumeration.ProjectMethod;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_planning")
public class Planning extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date procurementStart;
    private Date procurementEnd;
    private Date procurementPlanRequest;
    private Date procurementPlanApprove;
    private Date procurementPlanContract;
    private String procurementPlanApproveBy;
    private ProjectMethod procurementPlanMethod;
    private Double procurementBudgetPlan;
    private String remark;
    private Long projectId;
    private Long fiscalYearId;
}
