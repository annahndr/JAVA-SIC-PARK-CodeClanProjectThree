package com.codeclan.JavasicPark.Models;

import com.fasterxml.jackson.annotation.JsonValue;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="dinosaurs")
public class Dinosaur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="name")
    private String name;

    @Column(name ="dino_species")
    private String dinoSpecies;

    @Column(name = "dino_diet")
    private String dinoDietType;

    @Column(name = "image_path")
    private String dinoImage;


    @ManyToOne
    @JoinColumn(name = "paddock_id", nullable = false) //means we can only create a dino if it has a paddock
    private Paddock paddock;


    public Dinosaur(String name, String dinoSpecies, String dinoDietType, Paddock paddock,
                    String dinoImage) {
        this.name = name;
        this.dinoSpecies = dinoSpecies;
        this.dinoDietType = dinoDietType;
        this.paddock = paddock;
        this.dinoImage = dinoImage;
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

    @JsonValue
    public String getDinoSpecies() {
        return dinoSpecies;
    }

    public void setDinoSpecies(String dinoSpecies) {
        this.dinoSpecies = dinoSpecies;
    }

    public String getDinoDietType() {
        return dinoDietType;
    }

    public void setDinoDietType(String dinoDietType) {
        this.dinoDietType = dinoDietType;
    }

    public String getDinoImage() {
        return dinoImage;
    }

    public void setDinoImage(String dinoImage) {
        this.dinoImage = dinoImage;
    }

    public Paddock getPaddock() {
        return paddock;
    }

    public void setPaddock(Paddock paddock) {
        this.paddock = paddock;
    }

//    TODO remove dino (front end)
//    TODO add dino (front end)

}
