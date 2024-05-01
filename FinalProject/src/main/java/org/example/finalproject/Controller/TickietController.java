package org.example.finalproject.Controller;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.example.finalproject.API.ApiResponse;
import org.example.finalproject.Model.Sport;
import org.example.finalproject.Model.Ticket;
import org.example.finalproject.Service.TicketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RequestMapping("/api/v1/ticket/")
@RestController
public class TickietController {
    private final TicketService ticketService;

     @PostMapping("/add")
    public ResponseEntity addSports(@RequestBody @Valid Ticket ticket) {
        ticketService.addTicket(ticket);
        return ResponseEntity.status(200).body(new ApiResponse("Ticket added successfully"));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateSports(@PathVariable Integer id, @RequestBody @Valid Ticket ticket) {
        ticketService.updateTickiet(id, ticket);
        return ResponseEntity.status(200).body(new ApiResponse("Ticket updated successfully"));
    }

    @GetMapping("/get")
    public List<Ticket> getAllTicket() {
        return ticketService.getAllTickets();
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteSports(@PathVariable Integer id){
        ticketService.deleteTicket(id);
        return ResponseEntity.status(200).body(new ApiResponse("Ticket deleted successfully"));
    }

}
