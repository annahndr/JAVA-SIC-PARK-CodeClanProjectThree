package com.codeclan.JavasicPark.repositories.Dinosaurs;

import com.codeclan.JavasicPark.Models.Dinosaur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DinosaurRepository extends JpaRepository<Dinosaur, Long> {
}
