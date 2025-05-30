package com.procurementsystem.procurementsystem.model;

import com.procurementsystem.procurementsystem.enumeration.UserType;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tbl_user")
public class User extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username",nullable = false,unique = true)
    private String username;
    private String firstname;
    private String lastname;
    @Column(name = "gender",length = 10)
    private String gender;
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;
    private String email;
    @Column(name = "phone_number",length = 15,nullable = false)
    private String phoneNumber;
    private String address;
    @Column(name = "user_type")
    private UserType userType;
    private String status;
    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Device> device;
}
