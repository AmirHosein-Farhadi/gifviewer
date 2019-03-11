package com.sinoed.gifviewer.model;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;

    @OneToMany(mappedBy = "user")
    private Set<Gif> gifs = new HashSet<>();
}
