package com.codeclan.JavasicPark.Components;


import com.codeclan.JavasicPark.Models.*;
import com.codeclan.JavasicPark.repositories.Dinosaurs.DinosaurRepository;
import com.codeclan.JavasicPark.repositories.Paddocks.PaddockRepository;
import com.codeclan.JavasicPark.repositories.Visitors.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PaddockRepository paddockRepository;

    @Autowired
    DinosaurRepository dinosaurRepository;

    @Autowired
    VisitorRepository visitorRepository;

    public DataLoader(){

    }


    public void run(ApplicationArguments args) {

        Paddock sunny_acres = new Paddock("Sunny Acres", "Herbivore", 10);
        Paddock green_hills = new Paddock("Green Hills", "Herbivore", 5);
        Paddock bay_view = new Paddock("Bay View", "Carnivore", 3);
        Paddock lake_side = new Paddock("Lake Side", "Herbivore", 2);
        Paddock fishers_point= new Paddock("Fishers Point", "Herbivore", 1);

        Dinosaur dippy = new Dinosaur("Dippy", "Diplodocus", "Herbivore", "/images/dippy.png");
        Dinosaur steggy = new Dinosaur("Steggy","Stegosaurus" , "Herbivore",
                "/images/steggy.png");
        Dinosaur rex = new Dinosaur("Rex", "Tyranosaurusrex", "Carnivore","/images/trex.jpg");
        Dinosaur velo = new Dinosaur("Velo", "Velociraptor", "Carnivore", "/images/velo.png");

        Visitor anna = new Visitor("Anna");
        Visitor gillian = new Visitor("Gillian");
        Visitor david = new Visitor("David");

        sunny_acres.setActivated(true);
        paddockRepository.save(sunny_acres);

        paddockRepository.save(green_hills);

        bay_view.setActivated(true);
        paddockRepository.save(bay_view);

        paddockRepository.save(lake_side);
        paddockRepository.save(fishers_point);

        dinosaurRepository.save(rex);


        velo.setPaddock(bay_view);
        dinosaurRepository.save(velo);


        dippy.setPaddock(sunny_acres);
        steggy.setPaddock(sunny_acres);
        dinosaurRepository.save(dippy);
        dinosaurRepository.save(steggy);


        visitorRepository.save(anna);
        visitorRepository.save(gillian);
        visitorRepository.save(david);



    }
}
