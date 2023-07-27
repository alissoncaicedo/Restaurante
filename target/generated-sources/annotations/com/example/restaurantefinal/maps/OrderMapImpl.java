package com.example.restaurantefinal.maps;

import com.example.restaurantefinal.dto.OrderResponseDto;
import com.example.restaurantefinal.entities.Order;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-27T08:54:14-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class OrderMapImpl implements OrderMap {

    @Override
    public OrderResponseDto transformationOrder(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderResponseDto orderResponseDto = new OrderResponseDto();

        orderResponseDto.setCampus( order.getCampus() );
        orderResponseDto.setStatus( order.getStatus() );

        return orderResponseDto;
    }

    @Override
    public List<OrderResponseDto> transformListOrder(List<Order> ListOrder) {
        if ( ListOrder == null ) {
            return null;
        }

        List<OrderResponseDto> list = new ArrayList<OrderResponseDto>( ListOrder.size() );
        for ( Order order : ListOrder ) {
            list.add( transformationOrder( order ) );
        }

        return list;
    }
}
