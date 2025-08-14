package com.tourism.seligo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sellerId;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    private User user; // Base user: name, email, password, role

    private String address;
    private String phoneNumber;

    @Column(name = "profile_image")
    private String profileImage;

    private String businessName;
    private String description; // optional seller description
}
