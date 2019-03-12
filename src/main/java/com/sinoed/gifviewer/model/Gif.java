package com.sinoed.gifviewer.model;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Gif {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private LocalDate dateUploaded;

    @NonNull
    private boolean favorite;

    @NonNull
    @ManyToOne
    private User user;
}
