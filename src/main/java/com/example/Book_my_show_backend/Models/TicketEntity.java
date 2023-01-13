package com.example.Book_my_show_backend.Models;


import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="tickets")
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String alloted_seats;

    private int amount;

    private Date booked_at;

    //Here you will connect
    @ManyToOne
    @JoinColumn
    private UserEntity user; //

    @ManyToOne
    @JoinColumn
    private ShowEntity show;

    @OneToMany(mappedBy = "ticket",cascade = CascadeType.ALL)
    private List<ShowSeatEntity> bookedSeats;

}
