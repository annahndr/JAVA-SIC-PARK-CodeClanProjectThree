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

        Paddock sunny_acres = new Paddock("Sunny Acres", PaddockType.HERBIVORE, 10);
        Paddock green_hills = new Paddock("Green Hills", PaddockType.HERBIVORE, 5);
        Paddock bay_view = new Paddock("Bay View", PaddockType.CARNIVORE, 3);
        Paddock lake_side = new Paddock("Lake Side", PaddockType.HERBIVORE, 2);
        Paddock fishers_point= new Paddock("Fishers Point", PaddockType.CARNIVORE, 1);

        Dinosaur dippy = new Dinosaur("Dippy", DinoSpecies.DIPLODOCUS, DinoDietType.HERBIVORE, sunny_acres);
        Dinosaur steggy = new Dinosaur("Steggy", DinoSpecies.STEGOSAURUS, DinoDietType.HERBIVORE, sunny_acres);
        Dinosaur rex = new Dinosaur("Rex", DinoSpecies.TYRANOSAURUSREX, DinoDietType.CARNIVORE, bay_view);
        Dinosaur velo = new Dinosaur("Velo", DinoSpecies.VELOCIRAPTOR, DinoDietType.CARNIVORE, bay_view);

        Visitor anna = new Visitor("Anna");
        Visitor gillian = new Visitor("Gillian");
        Visitor david = new Visitor("David");

        paddockRepository.save(sunny_acres);
        paddockRepository.save(green_hills);
        paddockRepository.save(bay_view);
        paddockRepository.save(lake_side);
        paddockRepository.save(fishers_point);


        dinosaurRepository.save(dippy);
        dinosaurRepository.save(steggy);
        dinosaurRepository.save(rex);
        dinosaurRepository.save(velo);


        visitorRepository.save(anna);
        visitorRepository.save(gillian);
        visitorRepository.save(david);



    }
}
