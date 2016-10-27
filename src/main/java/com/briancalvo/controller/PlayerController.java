package com.briancalvo.controller;

import com.briancalvo.domain.Player;
import com.briancalvo.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Brian on 24/10/2016.
 */
@RestController
@RequestMapping ("/players")
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Player createPlayer(@RequestBody Player player){
         return playerRepository.save(player);
    }

    @RequestMapping(method= RequestMethod.GET)
    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    @RequestMapping(value = "/{id}",
            method = RequestMethod.GET)
    public Player findById(@PathVariable Long id){
        Player player =  playerRepository.findOne(id);
        return player;
    }

    @RequestMapping(value = "/byPoints/{num}",
            method = RequestMethod.GET)
    public List<Player> findByPointsGreaterThan(@PathVariable Integer num){
        return playerRepository.findByPointsGreaterThan(num);
    }
}
