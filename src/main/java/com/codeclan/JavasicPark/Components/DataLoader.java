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
        Paddock meat_feast = new Paddock("Meat Feast", PaddockType.CARNIVORE, 3);

        Dinosaur dippy = new Dinosaur("Dippy", DinoSpecies.DIPLODOCUS, DinoDietType.HERBIVORE, sunny_acres);
        Dinosaur steggy = new Dinosaur("Steggy", DinoSpecies.STEGOSAURUS, DinoDietType.HERBIVORE, sunny_acres);
        Dinosaur rex = new Dinosaur("Rex", DinoSpecies.TYRANOSAURUSREX, DinoDietType.CARNIVORE, meat_feast);
        Dinosaur velo = new Dinosaur("Velo", DinoSpecies.VELOCIRAPTOR, DinoDietType.CARNIVORE, meat_feast);

        Visitor anna = new Visitor("Anna");
        Visitor gillian = new Visitor("Gillian");
        Visitor david = new Visitor("David");

        paddockRepository.save(sunny_acres);
        paddockRepository.save(green_hills);
        paddockRepository.save(meat_feast);

        dinosaurRepository.save(dippy);
        dinosaurRepository.save(steggy);
        dinosaurRepository.save(rex);
        dinosaurRepository.save(velo);


        visitorRepository.save(anna);
        visitorRepository.save(gillian);
        visitorRepository.save(david);



    }
}
