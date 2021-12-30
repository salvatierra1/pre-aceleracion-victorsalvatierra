package com.disney.disneyworld.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table (name = "characters")
@Getter
@Setter
public class CharaterEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String image;

    private String name;

    private int age;

    private double weight;

    private String history;

}
