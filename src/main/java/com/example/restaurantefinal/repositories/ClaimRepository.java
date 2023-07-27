package com.example.restaurantefinal.repositories;

import com.example.restaurantefinal.entities.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository  extends JpaRepository<Claim,Integer> {


}
