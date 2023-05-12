package com.example.demo.services;

import com.example.demo.DTO.GameDTO;
import com.example.demo.DTO.GameMinDTO;
import com.example.demo.entities.Game;
import com.example.demo.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        return gameRepository.findAll().stream().map(game -> new GameMinDTO(game)).toList();
    }
}
