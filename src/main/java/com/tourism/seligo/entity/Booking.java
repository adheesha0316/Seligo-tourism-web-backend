package com.tourism.seligo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingId;

    @Temporal(TemporalType.DATE)
    private Date bookingDate;

    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;

    private double totalPrice;
    private String status; // CONFIRMED, CANCELLED, COMPLETED

    @ManyToOne
    @JoinColumn(name = "touristId")
    private Tourist tourist;

    @ManyToOne
    @JoinColumn(name = "guideId")
    private Guide guide;

    @ManyToOne
    @JoinColumn(name = "hotelId")
    private Hotel hotel;

    @ManyToOne
    @JoinColumn(name = "cabId")
    private Vehicle vehicle;
}
