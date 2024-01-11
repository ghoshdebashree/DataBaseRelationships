package com.TesingDBRelations.DataBaseRelationships.CONTROLLER;

import com.TesingDBRelations.DataBaseRelationships.ENTITY.PlayerProfile;
import com.TesingDBRelations.DataBaseRelationships.SERVICE.PlayerProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerProfileController {

    @Autowired
    private PlayerProfileService playerProfileService;

    @GetMapping("/getAllPlayers")
    public List<PlayerProfile> getAllPlayers(){
        return playerProfileService.getAllPlayerProfile();
    }

    @GetMapping("/getOnePlayer/{id}")
    public PlayerProfile getOne(@PathVariable int id){
        return playerProfileService.getOnePlayerProfile(id);
    }

    @PostMapping("/addPlayerProfile")
    public PlayerProfile addPlayer(@RequestBody PlayerProfile playerProfile){
        return playerProfileService.addPlayerProfile(playerProfile);
    }

    @DeleteMapping("/deletePlayer/{id}")
    public void deletePlayer(@PathVariable int id){
        playerProfileService.deletePlayerProfile(id);
    }
}
