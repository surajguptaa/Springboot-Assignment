package com.userManage.userManagementSystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private String userPhone;
    private LocalDate userDOB;
    private String userAddress;
    private Type userType;

}
