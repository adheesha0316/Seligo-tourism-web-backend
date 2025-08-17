package com.tourism.seligo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GuideDto {
    private Integer guideId;
    private Integer userId; // Linked User ID
    private String name;
    private String language;
    private double ratePerDay;
    private String contactNumber;
    private String nic;
    private boolean available;
    private String profileImage; // Path or URL to profile picture
    private String licenseImage; // Path or URL to nic picture
}
