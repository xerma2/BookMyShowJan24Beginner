package com.backendlld.bookmyshowjan24beginner.controllers;

import com.backendlld.bookmyshowjan24beginner.models.BookingStatus;
import com.backendlld.bookmyshowjan24beginner.models.Show;
import com.backendlld.bookmyshowjan24beginner.models.Ticket;
import com.backendlld.bookmyshowjan24beginner.models.User;
import com.backendlld.bookmyshowjan24beginner.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class TicketController {
    @Autowired
    private TicketService ticketService;

    public List<Ticket> getTicketByUser(int userId){
        User user = new User();
        user.setId(userId);
        return ticketService.getTicketByUser(user);
    }

    public List<Ticket> getTicketsByShow(int showId){
        Show show = new Show();
        show.setId(showId);
        return ticketService.getTicketByShow(show);
    }

    public List<Ticket> getTicketsByStatus(BookingStatus status){
        return ticketService.getTicketsByStatus(status);
    }
}
