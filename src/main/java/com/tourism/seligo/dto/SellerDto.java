package com.tourism.seligo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SellerDto {
    private Integer sellerId;
    private Integer userId;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String profileImage;
    private String businessName;
    private String description;
}
