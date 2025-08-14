package com.tourism.seligo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer driverId;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    private User user; // Base user info: name, email, phone, password, role

    private String vehicleType; // car, van, bus
    private String plateNumber;
    private double pricePerKm;
    private int seatCount;
    private boolean available;

    @Column(name = "profile_image")
    private String profileImage;

    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL)
    private List<Booking> bookings;
}
