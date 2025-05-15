package com.procurementsystem.procurementsystem.model;

import com.procurementsystem.procurementsystem.enumeration.PrepareBiddingStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_PrepareBidding")
public class PrepareBidding {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prepareBiddingId;
    private Date prepareStartDate;
    private Date approvedDateMOH;
    private Date approvedDateMEF;
    private PrepareBiddingStatus prepareBiddingStatus;
    private String remarks;
    private Long projectId;
}
