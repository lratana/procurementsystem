package com.procurementsystem.procurementsystem.model;

import com.procurementsystem.procurementsystem.enumeration.ContractStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "tbl_contract")
public class Contract extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contractId;
    private String contractNumber;
    private String contractTitle;
    private String contractDescription;
    private String contractType;
    private double contractValue;
    private Date contractStartDate;
    private Date contractEndDate;
    private ContractStatus contractStatus;
    private String warrantyPeriod;
    private Date contractApprovedDateMOH;
    private Date contractApprovedDateMEF;
    private String remarkContract;
    private Long projectId;
    private Long bidId;

}
