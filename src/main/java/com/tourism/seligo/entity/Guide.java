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
public class Guide {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer guideId;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    private User user; // Base user: name, email, password, role

    private String language;
    private double ratePerDay;
    private String contactNumber;
    private boolean available;

    @Column(name = "profile_image")
    private String profileImage;

    @OneToMany(mappedBy = "guide", cascade = CascadeType.ALL)
    private List<Booking> bookings;
}
