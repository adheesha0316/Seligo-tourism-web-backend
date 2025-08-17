package com.tourism.seligo.entity;

import com.tourism.seligo.enums.AvailabilityStatus;
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
    private User user; // Base user info: name, email, password, role

    private String vehicleType; // car, van, bus
    private String plateNumber;
    private double pricePerKm;
    private int seatCount;
    private String contactNumber;

    @Enumerated(EnumType.STRING)
    private AvailabilityStatus availability; // Enum instead of boolean

    @Column(name = "profile_image")
    private String profileImage;

    @Column(name = "license_image")
    private String licenseImage;

    @OneToMany(mappedBy = "vehicle", cascade = CascadeType.ALL)
    private List<Booking> bookings;
}
