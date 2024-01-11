package com.TesingDBRelations.DataBaseRelationships.SERVICE;

import com.TesingDBRelations.DataBaseRelationships.ENTITY.PlayerProfile;
import com.TesingDBRelations.DataBaseRelationships.REPOSITORY.PlayerProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerProfileService {

    @Autowired
    private PlayerProfileRepository playerProfileRepository;

    public List<PlayerProfile> getAllPlayerProfile(){
        return playerProfileRepository.findAll();
    }
    public PlayerProfile getOnePlayerProfile(int id){
        return playerProfileRepository.findById(id).get();
    }
    public PlayerProfile addPlayerProfile(PlayerProfile playerProfile){
        return playerProfileRepository.save(playerProfile);
    }
    public void deletePlayerProfile(int id){
        playerProfileRepository.deleteById(id);
    }
}
