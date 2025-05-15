package com.procurementsystem.procurementsystem.model;

import com.procurementsystem.procurementsystem.enumeration.ProjectMethod;
import com.procurementsystem.procurementsystem.enumeration.ProjectStatus;
import com.procurementsystem.procurementsystem.enumeration.ProjectType;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_project")
public class Project extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String projectName;
    private String projectDescription;
    private ProjectType projectType;
    private ProjectMethod projectMethod;
    private Double budgetEstimate;
    private String fundingSource;
    private Date startDate;
    private Date endDate;
    private ProjectStatus projectStatus;
    private Long planId;
}
