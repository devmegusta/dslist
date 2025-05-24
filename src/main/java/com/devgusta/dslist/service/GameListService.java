package com.devgusta.dslist.service;

import com.devgusta.dslist.DTO.GameDTO;
import com.devgusta.dslist.DTO.GameListDTO;
import com.devgusta.dslist.DTO.GameMinDTO;
import com.devgusta.dslist.model.Game;
import com.devgusta.dslist.model.GameList;
import com.devgusta.dslist.repository.GameListRepository;
import com.devgusta.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
