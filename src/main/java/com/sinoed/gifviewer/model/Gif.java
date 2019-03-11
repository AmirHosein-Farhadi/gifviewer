package com.sinoed.gifviewer.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Gif {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private LocalDate dateUploaded;

    private boolean favorite;

    @ManyToOne
    private User user;
}
