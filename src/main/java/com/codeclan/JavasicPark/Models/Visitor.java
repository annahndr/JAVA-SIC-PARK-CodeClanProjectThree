package com.codeclan.JavasicPark.Models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "vistors")
public class Visitor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    public Visitor(String name) {
        this.name = name;
    }

    public Visitor() {
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
}
