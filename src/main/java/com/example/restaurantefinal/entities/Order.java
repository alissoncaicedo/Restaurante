package com.example.restaurantefinal.entities;

import jakarta.persistence.*;

@Entity
@Table (name="order")
public class Order {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "idOrder", nullable = false)
    private Integer idOrder;

    @Column (name = "role", nullable = false)
    private Character role;

    @Column (name= "campus", nullable = false)
    private String campus;

    @Column (name = "status", nullable = false)
    private String status;

    public Order() {
    }

    public Order(Integer idOrder, Character role, String campus, String status) {
        this.idOrder = idOrder;
        this.role = role;
        this.campus = campus;
        this.status = status;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public Character getRole() {
        return role;
    }

    public void setRole(Character role) {
        this.role = role;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
