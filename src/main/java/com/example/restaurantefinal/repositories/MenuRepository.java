package com.example.restaurantefinal.repositories;

import com.example.restaurantefinal.entitis.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<Menu,Integer> {


}
