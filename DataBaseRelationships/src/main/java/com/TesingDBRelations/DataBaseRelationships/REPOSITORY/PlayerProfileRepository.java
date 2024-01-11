package com.TesingDBRelations.DataBaseRelationships.REPOSITORY;

import com.TesingDBRelations.DataBaseRelationships.ENTITY.PlayerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerProfileRepository extends JpaRepository<PlayerProfile, Integer> {
}
