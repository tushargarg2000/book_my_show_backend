package com.example.Book_my_show_backend.Dtos;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;


@Data
public class ShowRequestDto {

    LocalDate showDate;

    LocalTime showTime;

    String movieName;

    int theaterId;

    double multiplier;
}
