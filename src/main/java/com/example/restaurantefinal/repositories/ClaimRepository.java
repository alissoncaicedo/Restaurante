package com.example.restaurantefinal.repositories;

import com.example.restaurantefinal.entitis.Claim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimRepository  extends JpaRepository<Claim,Integer> {


}
