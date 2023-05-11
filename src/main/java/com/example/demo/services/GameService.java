package com.example.demo.services;

import com.example.demo.DTO.GameMinDTO;
import com.example.demo.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> findAll(){
        return gameRepository.findAll().stream().map(game -> new GameMinDTO(game)).toList();
    }
}
