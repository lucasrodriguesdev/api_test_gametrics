package com.example.demo.controllers;

import com.example.demo.domain.Game;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameApiController {

    private List<Game> games = new ArrayList<>();

    public GameApiController(){
        games.addAll(List.of(
                new Game("001","Final Fantasy Tatics", "1995",4.80),
                new Game("002","Dan Dan Stompland", "1997",5.00),
                new Game("003","Super Mario World", "1990",4.70)
        ));
    }

    @RequestMapping(value = "/games", method = RequestMethod.GET)
    Iterable<Game> getGames(){
        return games;
    }

    @PostMapping
    Game postGame(@RequestBody Game game){
        games.add(game);
        return game;
    }

}
