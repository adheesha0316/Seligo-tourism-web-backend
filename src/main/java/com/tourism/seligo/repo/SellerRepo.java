package com.tourism.seligo.repo;

import com.tourism.seligo.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SellerRepo extends JpaRepository<Seller, Integer> {
    Optional<Seller> findByUserEmail(String email); // Optional: for login/auth
}
