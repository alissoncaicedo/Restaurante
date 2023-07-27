package com.example.restaurantefinal.entities;

import jakarta.persistence.*;

@Entity
@Table(name="dishes")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name="role", nullable = false)
    private Character role;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name="price", nullable = false)
    private Integer price;

    @Column(name="description", nullable = false)
    private String description;

    @Column(name="url", nullable = false)
    private String url;

    @Column(name = "categories", nullable = false)
    private String categories;

    @Column(name="state", nullable = false)
    private Boolean state = true;

    @Column(name = "campus")
    private String campus;

    @Column(name = "preparationtime", nullable = false)
    private Double preparationtime;

    public Menu() {
    }

    public Menu(Integer id, Character role, String name, Integer price, String description, String url, String categories, Boolean state, String campus, Double preparationtime) {
        this.id = id;
        this.role = role;
        this.name = name;
        this.price = price;
        this.description = description;
        this.url = url;
        this.categories = categories;
        this.state = state;
        this.campus = campus;
        this.preparationtime = preparationtime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Character getRole() {
        return role;
    }

    public void setRole(Character role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public Double getPreparationtime() {
        return preparationtime;
    }

    public void setPreparationtime(Double preparationtime) {
        this.preparationtime = preparationtime;
    }
}
