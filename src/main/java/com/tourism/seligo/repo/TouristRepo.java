package com.tourism.seligo.repo;

import com.tourism.seligo.entity.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TouristRepo extends JpaRepository<Tourist, Integer> {
}
