package com.codeclan.JavasicPark.projections;

import com.codeclan.JavasicPark.Models.Dinosaur;
import com.codeclan.JavasicPark.Models.PaddockType;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name ="embedPaddockInDinosaur", types= Dinosaur.class)
public interface EmbedPaddockInDinosaur {
    long getId();
    String getName();
    PaddockType getPaddockType();
    int getMaxNoDinosaurs();
    boolean isfed();
    List<Dinosaur> getDinosaurs();

}
