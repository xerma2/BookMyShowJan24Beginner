package com.backendlld.bookmyshowjan24beginner.repos;

import com.backendlld.bookmyshowjan24beginner.models.BookingStatus;
import com.backendlld.bookmyshowjan24beginner.models.Show;
import com.backendlld.bookmyshowjan24beginner.models.Ticket;
import com.backendlld.bookmyshowjan24beginner.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByUser(User user);
    List<Ticket> findByShow(Show show);
    List<Ticket> findByBookingStatus(BookingStatus status);
}
