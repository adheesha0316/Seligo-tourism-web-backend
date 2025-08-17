package com.tourism.seligo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tourist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer touristId;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    private User user; // linked base user with name, email, password, role

    private String nationality;
    private String passportNumber;
    private String phoneNumber;

    @Column(name = "profile_image")
    private String profileImage;

    @Column(name = "passport_image")
    private String passportImage;

    @OneToMany(mappedBy = "tourist", cascade = CascadeType.ALL)
    private List<Booking> bookings;
}
