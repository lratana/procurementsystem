package com.procurementsystem.procurementsystem.model;

import com.procurementsystem.procurementsystem.enumeration.RegistrationStatus;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
@Table(name = "tbl_Bidder")
public class Bidder extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long BidderId;
    private String companyName;
    private String contactPerson;
    private String contactPhone;
    private String email;
    private String address;
    private String taxIdentificationNumber;
    private String registrationNumber;
    private RegistrationStatus registrationStatus;
    private Long userId;
}
