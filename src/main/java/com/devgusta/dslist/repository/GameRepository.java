package com.devgusta.dslist.repository;

import com.devgusta.dslist.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
