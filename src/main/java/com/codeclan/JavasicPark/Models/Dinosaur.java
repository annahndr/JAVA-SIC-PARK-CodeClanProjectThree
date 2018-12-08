package com.codeclan.JavasicPark.Models;

import javax.persistence.*;

@Entity
@Table(name ="dinosaurs")
public class Dinosaur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="name")
    private String name;

    @Column(name ="dino_species")
    private DinoSpecies dinoSpecies;

    @Column(name = "dino_diet")
    private DinoDietType dinoDietType;


    @ManyToOne
    @JoinColumn(name = "paddock_id", nullable = false) //means we can only create a dino if it has a paddock
    private Paddock paddock;

    public Dinosaur(String name, DinoSpecies dinoSpecies, DinoDietType dinoDietType, Paddock paddock) {
        this.name = name;
        this.dinoSpecies = dinoSpecies;
        this.dinoDietType = dinoDietType;
        this.paddock = paddock;
    }

    public Dinosaur() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DinoSpecies getDinoSpecies() {
        return dinoSpecies;
    }

    public void setDinoSpecies(DinoSpecies dinoSpecies) {
        this.dinoSpecies = dinoSpecies;
    }

    public DinoDietType getDinoDietType() {
        return dinoDietType;
    }

    public void setDinoDietType(DinoDietType dinoDietType) {
        this.dinoDietType = dinoDietType;
    }

//    TODO remove dino (front end)
//    TODO add dino (front end)

}
