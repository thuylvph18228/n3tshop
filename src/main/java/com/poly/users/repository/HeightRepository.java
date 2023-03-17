package com.poly.users.repository;

import com.poly.users.entity.Height;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeightRepository extends JpaRepository<Height, Integer> {
}
