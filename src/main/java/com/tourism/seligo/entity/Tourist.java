package com.tourism.seligo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tourist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer touristId;

    private String name;
    private String email;
    private String phone;
    private String nationality;
    private String passportNumber;

    @OneToMany(mappedBy = "tourist", cascade = CascadeType.ALL)
    private List<Booking> bookings;
}
