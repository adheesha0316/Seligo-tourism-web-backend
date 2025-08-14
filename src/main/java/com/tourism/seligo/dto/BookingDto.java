package com.tourism.seligo.dto;

import com.tourism.seligo.enums.BookingStatus;
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
    private BookingStatus status; // Enum instead of String

    private Integer touristId;
    private Integer guideId;
    private Integer hotelId;
    private Integer driverId; // Renamed from cabId to match Driver entity
}
