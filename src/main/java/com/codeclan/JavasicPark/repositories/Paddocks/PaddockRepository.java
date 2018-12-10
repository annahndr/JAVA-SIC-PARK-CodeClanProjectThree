package com.codeclan.JavasicPark.repositories.Paddocks;

import com.codeclan.JavasicPark.Models.Paddock;
import com.codeclan.JavasicPark.projections.EmbedDinoInPaddock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedDinoInPaddock.class)
public interface PaddockRepository extends JpaRepository<Paddock, Long> {
}



