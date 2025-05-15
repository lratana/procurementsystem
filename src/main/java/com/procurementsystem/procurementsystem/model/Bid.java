package com.procurementsystem.procurementsystem.model;

import com.procurementsystem.procurementsystem.enumeration.BidStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_Bid")
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bidId;
    private Date announcementDate;
    private Date openingDate;
    private Double bidAmount;
    private BidStatus bidStatus;
    private Date bidSubmissionDate;
    private Long projectId;
    private Long bidderId;
}
