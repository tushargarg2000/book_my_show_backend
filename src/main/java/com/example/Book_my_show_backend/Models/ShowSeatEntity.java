package com.example.Book_my_show_backend.Models;


import com.example.Book_my_show_backend.Enums.SeatType;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "show_seats")
public class ShowSeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private boolean booked;


    private Date bookedAt;


    @ManyToOne
    @JoinColumn
    private ShowEntity show;

    @ManyToOne
    @JoinColumn
    private TicketEntity ticket;
}
