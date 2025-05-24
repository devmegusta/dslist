package com.devgusta.dslist.repository;
import com.devgusta.dslist.model.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList,Long>{
}
