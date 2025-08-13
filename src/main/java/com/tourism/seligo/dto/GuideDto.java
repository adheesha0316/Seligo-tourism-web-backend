package com.tourism.seligo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuideDto {
    private Integer guideId;
    private String name;
    private String language;
    private double ratePerDay;
    private String contactNumber;
    private boolean available;
}
