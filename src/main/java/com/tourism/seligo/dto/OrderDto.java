package com.tourism.seligo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private Integer orderId;
    private String itemName;
    private int quantity;
    private double totalPrice;

    private Integer touristId; // linked Tourist
    private Integer sellerId;  // linked Seller
}
