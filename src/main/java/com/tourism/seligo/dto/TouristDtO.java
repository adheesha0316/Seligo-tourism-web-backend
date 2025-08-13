package com.tourism.seligo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TouristDtO {
    private Integer touristId;
    private String name;
    private String email;
    private String phone;
    private String nationality;
    private String passportNumber;
}
