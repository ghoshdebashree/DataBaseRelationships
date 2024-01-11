package com.TesingDBRelations.DataBaseRelationships.ENTITY;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PlayerProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tweeter;
    @OneToOne(mappedBy = "playerProfile",cascade = CascadeType.ALL)
    @JsonBackReference
    private Player player;
}
