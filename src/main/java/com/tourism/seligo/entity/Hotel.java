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
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hotelId;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    private User user; // Base user details: name, email, password, role

    private String hotelName;
    private String location;
    private double pricePerNight;
    private String contactNumber;
    private int stars;

    @Column(name = "profile_image")
    private String profileImage;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    private List<Booking> bookings;
}
