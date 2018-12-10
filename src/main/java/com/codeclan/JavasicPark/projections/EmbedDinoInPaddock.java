package com.codeclan.JavasicPark.projections;

import com.codeclan.JavasicPark.Models.Dinosaur;
import com.codeclan.JavasicPark.Models.Paddock;
import com.codeclan.JavasicPark.Models.PaddockType;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name ="embedDinoInPaddock", types= Paddock.class)
public interface EmbedDinoInPaddock {
    long getId();
    String getName();
    PaddockType getPaddockType();
    int getMaxNoDinosaurs();
    boolean isfed();
    List<Dinosaur> getDinosaurs();

}
