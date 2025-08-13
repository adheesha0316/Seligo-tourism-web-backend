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

    private String name;
    private String language;
    private double ratePerDay;
    private String contactNumber;
    private boolean available;

    @Column(name = "profileImage")
    private String profileImage;

    @OneToMany(mappedBy = "guide", cascade = CascadeType.ALL)
    private List<Booking> bookings;
}

