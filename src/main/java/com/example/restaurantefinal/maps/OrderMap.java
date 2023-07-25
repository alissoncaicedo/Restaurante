package com.example.restaurantefinal.maps;

import com.example.restaurantefinal.dto.MenuResponseDto;
import com.example.restaurantefinal.dto.OrderResponseDto;
import com.example.restaurantefinal.entitis.Menu;
import com.example.restaurantefinal.entitis.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring")
public interface OrderMap {
    @Mappings({
            @Mapping(source ="campus" ,target = "campus"),
            @Mapping(source ="status" ,target = "status" )

    })
    public OrderResponseDto transformationOrder(Order order);
    public List<OrderResponseDto> transformListOrder(List<Order> ListOrder);
}
