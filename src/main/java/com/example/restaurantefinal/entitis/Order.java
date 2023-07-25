package com.example.restaurantefinal.entitis;

import jakarta.persistence.*;

@Entity
@Table (name="order")
public class Order {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idOrder;

    @Column (name = "role")
    private Character role;

    @Column (name= "campus")
    private String campus;

    @Column (name = "status")
    private String status;


}
