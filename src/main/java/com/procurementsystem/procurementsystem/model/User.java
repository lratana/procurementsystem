package com.procurementsystem.procurementsystem.model;

import com.procurementsystem.procurementsystem.enumeration.UserType;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
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
    private Date birthdate;
    private String email;
    private String phoneNumber;
    private String address;
    @Column(name = "user_type")
    private UserType userType;
    private String status;
}
