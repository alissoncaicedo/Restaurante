package com.example.restaurantefinal.maps;

import com.example.restaurantefinal.dto.MenuResponseDto;
import com.example.restaurantefinal.entities.Menu;
import org.mapstruct.Mapper;

import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")

public interface MenuMap {
    @Mappings({
            @Mapping(source = "name", target="name"),
            @Mapping(source = "price", target="price"),
            @Mapping(source="url", target="photo"),
            @Mapping(source="description", target="description")

    })
    public MenuResponseDto transformationMenu(Menu menu);
    public List<MenuResponseDto> transformationListMenu(List<Menu> ListMenu);
}
