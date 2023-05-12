package com.example.demo.DTO;

import com.example.demo.entities.GameList;
import org.springframework.beans.BeanUtils;

public class GameListDTO {
    private String name;

    public GameListDTO(){}
    public GameListDTO(GameList gameList){
        BeanUtils.copyProperties(gameList, this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
