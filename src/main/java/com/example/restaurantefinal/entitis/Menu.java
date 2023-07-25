package com.example.restaurantefinal.entitis;

import jakarta.persistence.*;

@Entity
@Table(name="dishes")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name="name")
    private Character role;

    @Column(name = "name")
    private String name;

    @Column(name="price")
    private Integer price;

    @Column(name="descripcion")
    private String description;

    @Column(name="url")
    private String url;

    @Column(name = "categories")
    private String categories;

    @Column(name="state")
    private Boolean state;

    @Column(name = "campus")
    private String campus;

    @Column(name = "preparationtime")
    private Double preparationtime;



}
