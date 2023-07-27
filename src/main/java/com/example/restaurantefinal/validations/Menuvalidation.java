package com.example.restaurantefinal.validations;

import com.example.restaurantefinal.entities.Menu;
import org.springframework.stereotype.Component;

@Component
public class Menuvalidation {



    public boolean validationprice (Integer Price){
        if (Price <0){
           return true;
        }else {
            return false;
        }
    }

    public boolean validationcampus(String campus){
        if(campus.length()==0 || campus==null){
            return true;
        }else {
            return false;
        }

    }




}
