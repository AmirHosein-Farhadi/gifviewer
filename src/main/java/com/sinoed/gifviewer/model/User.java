package com.sinoed.gifviewer.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(exclude = {"gif"})
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;

    @OneToMany(mappedBy = "user")
    private Set<Gif> gif = new HashSet<>();
}
