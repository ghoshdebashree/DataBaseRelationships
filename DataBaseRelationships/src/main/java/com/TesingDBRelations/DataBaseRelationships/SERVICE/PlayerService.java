package com.TesingDBRelations.DataBaseRelationships.SERVICE;

import com.TesingDBRelations.DataBaseRelationships.ENTITY.Player;
import com.TesingDBRelations.DataBaseRelationships.ENTITY.PlayerProfile;
import com.TesingDBRelations.DataBaseRelationships.REPOSITORY.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> getAllPlayers(){
        return playerRepository.findAll();
    }
    public Player getOne(int id){
        return playerRepository.findById(id).get();
    }
    public Player addPlayer(Player player){
        return playerRepository.save(player);
    }
    public void deleteOne(int id){
        playerRepository.deleteById(id);
    }
    public Player assignProfile(int id, PlayerProfile playerProfile){
        Player player = playerRepository.findById(id).get();
        player.setPlayerProfile(playerProfile);
        return playerRepository.save(player);
    }


}
