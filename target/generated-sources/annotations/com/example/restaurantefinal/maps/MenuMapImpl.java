package com.example.restaurantefinal.maps;

import com.example.restaurantefinal.dto.MenuResponseDto;
import com.example.restaurantefinal.entities.Menu;
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
public class MenuMapImpl implements MenuMap {

    @Override
    public MenuResponseDto transformationMenu(Menu menu) {
        if ( menu == null ) {
            return null;
        }

        MenuResponseDto menuResponseDto = new MenuResponseDto();

        menuResponseDto.setName( menu.getName() );
        menuResponseDto.setPrice( menu.getPrice() );
        menuResponseDto.setPhoto( menu.getUrl() );
        menuResponseDto.setDescription( menu.getDescription() );

        return menuResponseDto;
    }

    @Override
    public List<MenuResponseDto> transformationListMenu(List<Menu> ListMenu) {
        if ( ListMenu == null ) {
            return null;
        }

        List<MenuResponseDto> list = new ArrayList<MenuResponseDto>( ListMenu.size() );
        for ( Menu menu : ListMenu ) {
            list.add( transformationMenu( menu ) );
        }

        return list;
    }
}
