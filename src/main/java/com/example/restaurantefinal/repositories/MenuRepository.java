package com.example.restaurantefinal.repositories;

import com.example.restaurantefinal.entities.Menu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu,Integer> {
    Page<Menu> findByCategoriesAndCampus(String category, String campus, Pageable pager);


}
