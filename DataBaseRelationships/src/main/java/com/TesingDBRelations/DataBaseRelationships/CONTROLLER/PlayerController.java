package com.TesingDBRelations.DataBaseRelationships.CONTROLLER;

import com.TesingDBRelations.DataBaseRelationships.ENTITY.Player;
import com.TesingDBRelations.DataBaseRelationships.ENTITY.PlayerProfile;
import com.TesingDBRelations.DataBaseRelationships.SERVICE.PlayerProfileService;
import com.TesingDBRelations.DataBaseRelationships.SERVICE.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    private PlayerService service;
    @Autowired
    private PlayerProfileService playerProfileService;

    @GetMapping("/getAll")
    public List<Player> allPlayers() {
        return service.getAllPlayers();
    }

    @GetMapping("/getOne/{id}")
    public Player getPlayer(@PathVariable int id){
        return service.getOne(id);
    }

    @PostMapping("/addPlayer")
    public Player addPlayer(@RequestBody Player player) {
        return service.addPlayer(player);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOne(@PathVariable int id) {
        service.deleteOne(id);
    }

    @PutMapping("/{id}/profiles/{profile_id}")
    public Player assignDetails(@PathVariable int id,@PathVariable int profile_id ){
        PlayerProfile playerProfile = playerProfileService.getOnePlayerProfile(profile_id);
        System.out.println(playerProfile);
        return service.assignProfile(id, playerProfile);

    }

}
