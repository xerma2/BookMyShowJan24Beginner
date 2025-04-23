package com.backendlld.bookmyshowjan24beginner.services;

import com.backendlld.bookmyshowjan24beginner.models.BookingStatus;
import com.backendlld.bookmyshowjan24beginner.models.Show;
import com.backendlld.bookmyshowjan24beginner.models.Ticket;
import com.backendlld.bookmyshowjan24beginner.models.User;
import com.backendlld.bookmyshowjan24beginner.repos.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepo;

    public List<Ticket> getTicketByUser(User user) {
        return ticketRepo.findByUser(user);
    }

    public List<Ticket> getTicketByShow(Show show){
        return ticketRepo.findByShow(show);
    }

    public List<Ticket> getTicketsByStatus(BookingStatus status){
        return ticketRepo.findByBookingStatus(status);
    }
}
