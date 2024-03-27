package com.example.dailycodeb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;

    @NotBlank(message = "Please add Department Name")//I want departmentName to be as equally important as departmentId that's why i am adding this validation to it
    private String departmentName;

    private String departmentAddress;

    private String departmentCode;
}
