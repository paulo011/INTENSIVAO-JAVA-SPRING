package com.example.demo.controllers;

import com.example.demo.DTO.GameListDTO;
import com.example.demo.DTO.GameMinDTO;
import com.example.demo.services.GameListService;
import com.example.demo.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListContreller {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findbyList(@PathVariable Long listId){
        return gameService.findByList(listId);
    }
}
