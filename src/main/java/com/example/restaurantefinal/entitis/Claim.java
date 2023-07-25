package com.example.restaurantefinal.entitis;

import jakarta.persistence.*;

@Entity
@Table(name="claim")
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name = "idOrder")
    private Integer idOrder;

    @Column (name = "campus")
    private String campus;

    @Column (name = "status")
    private String status;

    @Column (name = "reason")
    private String reason;


}
