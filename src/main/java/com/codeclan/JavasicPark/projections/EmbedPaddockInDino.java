package com.codeclan.JavasicPark.projections;

import com.codeclan.JavasicPark.Models.*;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name ="embedDinosaurInPaddock", types= Dinosaur.class)
public interface EmbedPaddockInDino {

    long getId();
    String getName();
    String getDinoSpecies();
    String getDinoDietType();
    Paddock getPaddock();
    String getDinoImage();



}
