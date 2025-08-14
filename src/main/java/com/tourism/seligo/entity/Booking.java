package com.tourism.seligo.entity;

import com.tourism.seligo.enums.BookingStatus;
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

    @Enumerated(EnumType.STRING)
    private BookingStatus status; // Enum instead of String

    @ManyToOne
    @JoinColumn(name = "tourist_id")
    private Tourist tourist;

    @ManyToOne
    @JoinColumn(name = "guide_id")
    private Guide guide;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;
}
