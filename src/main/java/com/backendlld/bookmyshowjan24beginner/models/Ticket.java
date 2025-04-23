package com.backendlld.bookmyshowjan24beginner.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Ticket extends BaseModel{
    @ManyToOne
    private Show show;

    @ManyToOne
    private User user;

    @ManyToMany
    List<Seat> bookedSeats;
    private double price;
    private LocalDateTime bookingTime;

    public Ticket(Show show, User user, List<Seat> bookedSeats,
                  double price, LocalDateTime bookingTime) {
        this.show = show;
        this.user = user;
        this.bookedSeats = bookedSeats;
        this.price = price;
        this.bookingTime = bookingTime;
    }
}
