package com.TesingDBRelations.DataBaseRelationships.REPOSITORY;

import com.TesingDBRelations.DataBaseRelationships.ENTITY.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
