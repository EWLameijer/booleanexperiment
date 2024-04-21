package com.example.booleanexperiment;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @JsonProperty("isEdible")
    private boolean isEdible;
}
