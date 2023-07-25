package com.example.restaurantefinal.maps;

import com.example.restaurantefinal.dto.ClaimResponseDto;
import com.example.restaurantefinal.dto.MenuResponseDto;
import com.example.restaurantefinal.entitis.Claim;
import com.example.restaurantefinal.entitis.Menu;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")

public interface ClaimMap {
    @Mappings({
            @Mapping(source = "campus", target="campus"),
            @Mapping(source = "status", target="status"),
            @Mapping(source="reason", target="reason"),


    })
    public ClaimResponseDto transformationClaim(Claim claim);
    public List<ClaimResponseDto> transformationListClaim(List<Claim> ListClaim);

}