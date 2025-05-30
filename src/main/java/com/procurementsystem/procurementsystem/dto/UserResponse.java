package com.procurementsystem.procurementsystem.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.procurementsystem.procurementsystem.enumeration.UserType;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class UserResponse {
    private Long id;
    private String username;
    @JsonProperty("first_name")
    private String firstname;
    @JsonProperty("last_name")
    private String lastname;
    private String gender;
    @JsonProperty("dob")
    private Date dateOfBirth;
    private String email;
    @JsonProperty("phone_number")
    private String phoneNumber;
    private String address;
    @JsonProperty("user_type")
    private UserType userType;
    private String status;
    @JsonProperty("created_at")
    private Date createdAt;
    @JsonProperty("created_by")
    private String createdBy;
    @JsonProperty("updated_by")
    private String updatedBy;
}
