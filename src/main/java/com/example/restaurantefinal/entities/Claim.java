package com.example.restaurantefinal.entities;

import jakarta.persistence.*;

@Entity
@Table(name="claim")
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id", nullable = false)
    private Integer id;

    @Column (name = "idOrder", nullable = false)
    private Integer idOrder;

    @Column (name = "campus", nullable = false)
    private String campus;

    @Column (name = "status", nullable = false)
    private String status;

    @Column (name = "reason", nullable = false)
    private String reason;

    public Claim() {
    }

    public Claim(Integer id, Integer idOrder, String campus, String status, String reason) {
        this.id = id;
        this.idOrder = idOrder;
        this.campus = campus;
        this.status = status;
        this.reason = reason;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
