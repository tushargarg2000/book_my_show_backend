package com.example.Book_my_show_backend.Models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Table(name = "movies")
@Entity
@Data
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false,unique = true)
    private String movieName;

    private int duration;

    private Date releaseDate;

    @OneToMany(mappedBy = "movie",cascade = CascadeType.ALL)
    private List<ShowEntity> listOfShows;




}
