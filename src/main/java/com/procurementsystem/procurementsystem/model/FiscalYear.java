package com.procurementsystem.procurementsystem.model;

import com.procurementsystem.procurementsystem.enumeration.FiscalYearStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_FiscalYear")
public class FiscalYear extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long fiscalYearId;
    private String fiscalYearName;
    private String budgetPeriod;
    private Date fiscalYearStartDate;
    private Date fiscalYearEndDate;
    private FiscalYearStatus fiscalYearStatus;
}
