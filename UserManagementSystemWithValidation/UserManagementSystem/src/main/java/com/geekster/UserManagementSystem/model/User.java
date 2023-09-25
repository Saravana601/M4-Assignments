package com.geekster.UserManagementSystem.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @NotNull
    private Integer userId;

    @NotBlank(message = "UserName can not be Blank")
    private String userName;

    @NotBlank(message = "Date of Birth can not be Blank")
    @Pattern(regexp = "^\\d{2}-\\d{2}-\\d{4}", message = "Date of Birth should be in dd-mm-yyyy format")
    private String userDOB;

    @NotBlank(message = "Email can not be blank")
    @Email(message = "Invalid Email Format")
    private String userEmail;

    @Size(min = 12, max = 12, message = "Phone number should be 12 digits long")
    @Pattern(regexp = "^\\d{2}\\d{10}$", message = "Invalid Phone Number format")
    private String phoneNumber;

    private Type userType;

    private LocalDate userCreateDate;

    private LocalTime userCreateTime;
}