package com.tourism.seligo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDto {
    private Integer bookingId;
    private Date bookingDate;
    private Date startDate;
    private Date endDate;
    private double totalPrice;
    private String status;

    private Integer touristId;
    private Integer guideId;
    private Integer hotelId;
    private Integer cabId;
}
