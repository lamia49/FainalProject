package org.example.finalproject.Service;

import lombok.AllArgsConstructor;
import org.example.finalproject.Model.Ticket;
import org.example.finalproject.Repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TicketService {
    private TicketRepository ticketRepository;
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }
    public void addTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }
    public void updateTickiet(Integer id,Ticket ticket) {
        Ticket ticket1=ticketRepository.findTicketById(id);
        ticket1.setName(ticket.getName());
        ticket1.setPrice(ticket.getPrice());
        ticket1.setSeats(ticket.getSeats());
        ticket1.setSeatClass(ticket.getSeatClass());
        ticket1.setSportType(ticket.getSportType());
        ticket1.setStatue(ticket.getStatue());
        ticketRepository.save(ticket1);
    }

    public void deleteTicket(Integer id) {
        Ticket ticket=ticketRepository.findTicketById(id);
        ticketRepository.delete(ticket);
    }
}
