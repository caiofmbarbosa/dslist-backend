package com.desafio_backend.game.repositories;

import com.desafio_backend.game.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
