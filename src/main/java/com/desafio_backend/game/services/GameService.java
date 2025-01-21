package com.desafio_backend.game.services;

import com.desafio_backend.game.dto.GameDTO;
import com.desafio_backend.game.entities.Game;
import com.desafio_backend.game.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> getAllGames() {
        List<Game> games = gameRepository.findAll();
        return games.stream().map(GameDTO::new).toList();

    }

}
