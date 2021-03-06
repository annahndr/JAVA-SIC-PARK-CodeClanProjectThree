package com.codeclan.JavasicPark.repositories.Dinosaurs;

import com.codeclan.JavasicPark.Models.Dinosaur;
import com.codeclan.JavasicPark.projections.EmbedPaddockInDino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedPaddockInDino.class)
public interface DinosaurRepository extends JpaRepository<Dinosaur, Long> {
}
