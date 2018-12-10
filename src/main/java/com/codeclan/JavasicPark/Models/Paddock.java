package com.codeclan.JavasicPark.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonValue;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//TODO need to find a place (think front end) for max visitors allowed (originally in Park, you could bring back all visitors then count them using JS)
//TODO random rampage (think this is front end)
//TODO evacuate park (think this is front end)

@Entity
@Table(name="paddocks")
public class Paddock implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name = "paddock_type")
    private String paddockType;

    @Column(name = "max_no_dinosaurs")
    private int maxNoDinosaurs;

    @Column(name= "fed")
    private boolean fed;

//    @Cascade(org.hibernate.annotations.CascadeType.DELETE)

    @JsonIgnore
    @OneToMany(mappedBy = "paddock", fetch = FetchType.LAZY)
    private List<Dinosaur> dinosaurs;

    public Paddock(String name, String paddockType, int maxNoDinosaurs) {
        this.name = name;
        this.paddockType = paddockType;
        this.maxNoDinosaurs = maxNoDinosaurs;
        this.fed = false;
        this.dinosaurs = new ArrayList<Dinosaur>();
    }

    public Paddock() {
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

    public String getPaddockType() {
        return paddockType;
    }


    public void setPaddockType(String paddockType) {
        this.paddockType = paddockType;
    }

    public int getMaxNoDinosaurs() {
        return maxNoDinosaurs;
    }

    public void setMaxNoDinosaurs(int maxNoDinosaurs) {
        this.maxNoDinosaurs = maxNoDinosaurs;
    }

    public boolean isFed() {
        return fed;
    }

    public void setFed(boolean fed) {
        this.fed = fed;
    }

    public List<Dinosaur> getDinosaurs() {
        return dinosaurs;
    }

    public void setDinosaurs(List<Dinosaur> dinosaurs) {
        this.dinosaurs = dinosaurs;
    }

    public int getDinoCount(){
        return this.dinosaurs.size();
    }

//    TODO add dino to paddock (front end)
//    TODO remove dino from paddock (front end)
//    TODO dino count (added)

}
