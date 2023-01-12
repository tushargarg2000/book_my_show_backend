package com.example.Book_my_show_backend.Models;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "shows")
public class ShowEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDate showDate;

    private LocalTime showTime;


    @CreationTimestamp
    private Date createdOn;


    @UpdateTimestamp
    private Date updatedOn;


    @ManyToOne
    @JoinColumn
    private MovieEntity movie;


    @ManyToOne
    @JoinColumn
    private TheaterEntity theater;


    @OneToMany(mappedBy = "show", cascade = CascadeType.ALL)
    private List<ShowSeatEntity> listOfSeats;


    @OneToMany(mappedBy = "show",cascade = CascadeType.ALL)
    private List<TicketEntity> listOfTickets;

}
