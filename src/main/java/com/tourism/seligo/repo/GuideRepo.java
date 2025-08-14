package com.tourism.seligo.repo;

import com.tourism.seligo.entity.Guide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuideRepo extends JpaRepository<Guide, Integer> {
}
