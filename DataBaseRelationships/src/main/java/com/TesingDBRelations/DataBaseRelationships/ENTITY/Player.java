package com.TesingDBRelations.DataBaseRelationships.ENTITY;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToOne(cascade=CascadeType.ALL, optional = false)
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
    @JsonManagedReference
    private PlayerProfile playerProfile;
}
